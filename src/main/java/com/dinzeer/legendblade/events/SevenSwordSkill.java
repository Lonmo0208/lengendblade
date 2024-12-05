package com.dinzeer.legendblade.events;

import com.dinzeer.legendblade.Legendblade;
import com.dinzeer.legendblade.data.LegendBuiltInRegsitry;
import com.dinzeer.legendblade.regsitry.LBSpecialEffectsRegistry;
import com.exfantasy.mclib.Utils.Dash.SMoveUtil;
import com.exfantasy.mclib.Utils.EntityPointer;
import com.exfantasy.mclib.Utils.PathGenerator;
import com.exfantasy.mclib.Utils.SlashBlade.SlashbladeUtils;
import mods.flammpfeil.slashblade.SlashBlade;
import mods.flammpfeil.slashblade.data.builtin.SlashBladeBuiltInRegistry;
import mods.flammpfeil.slashblade.entity.EntityDrive;
import mods.flammpfeil.slashblade.event.SlashBladeEvent;
import mods.flammpfeil.slashblade.registry.slashblade.SlashBladeDefinition;
import mods.flammpfeil.slashblade.util.VectorHelper;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Mod.EventBusSubscriber
public class SevenSwordSkill {
    @SubscribeEvent
    public static void UnLock(LivingDeathEvent event){
        if (!(event.getEntity() instanceof WitherBoss))return;
        if (event.getSource().getEntity() instanceof Player entity) {
            ItemStack stack = entity.getMainHandItem();
            CompoundTag tag = stack.getTag();
            if (stack.getTag().contains("UnLock"))return;
            if (SlashbladeUtils.getStringNBT(tag, "translationKey").equals("item.legendblade.sevensword")) {
                ///data get entity @s SelectedItem
                stack.getTag().putString("translationKey", "item.legendblade.sevensword_unlock");
                SlashbladeUtils.setStringNBT(stack.getTag(), "TextureName", "legendblade:model/sevensword/texture0.png");
                tag.putBoolean("UnLock",true);
            //    tag.getCompound("Parent").putString("TextureName","legendblade:model/sevensword/texture0.png");
                entity.sendSystemMessage(Component.translatable("se.legendblade.tooltip.sevensowrd.4"));
                entity.level().playSound(entity, entity.getOnPos(), SoundEvents.ENDER_DRAGON_SHOOT, null);
                if (entity.level() instanceof ServerLevel serverLevel){
                    serverLevel.sendParticles(ParticleTypes.EXPLOSION, entity.getX(), entity.getY(), entity.getZ(), 15, 0.1, 1, 1, 1);
                }
            }
        }
        }

    @SubscribeEvent
    public static void tooltipAffix(ItemTooltipEvent event){
        ItemStack stack = event.getItemStack();
        CompoundTag tag = stack.getTag();
        if (tag == null)return;
        if( SlashbladeUtils.getStringNBT(tag,"translationKey").equals("item.legendblade.sevensword")) {
            if (!stack.getTag().contains("UnLock")) {
                event.getToolTip().set(0, Component.translatable("se.legendblade.tooltip.sevensowrd.1").append(event.getToolTip().get(0)));
                event.getToolTip().add(Component.translatable("se.legendblade.tooltip.sevensowrd.2"));

            }else {
                event.getToolTip().set(0, Component.translatable("se.legendblade.tooltip.sevensowrd.3").append(event.getToolTip().get(0)));
            }

        }
    }
    @SubscribeEvent
    public static void slash(SlashBladeEvent.DoSlashEvent event){
       /* CompoundTag tag = event.getBlade().getTag();
        if( SlashbladeUtils.getStringNBT(tag,"translationKey").equals("item.legendblade.sevensword")) {
            if (((Player) event.getUser()).experienceLevel >=LBSpecialEffectsRegistry.FragmentedEdge.get().getRequestLevel()){
                SlashbladeUtils.setStringNBT(tag,"TextureName","legendblade:model/sevensword/texture0.png");
            }
        }*/

        Player player = (Player) event.getUser();
        ItemStack stack =event.getBlade();
        if (!stack.getTag().getBoolean("UnLock"))return;
        var blade = event.getSlashBladeState();
        if( blade.hasSpecialEffect(LBSpecialEffectsRegistry.FragmentedEdge.getId())){
            Optional<LivingEntity> targetedEntity = EntityPointer.findTargetedEntity(player, 10);
            if (targetedEntity.isEmpty())return;
            LivingEntity target = targetedEntity.get();
            Vec3 pos = player.position().add(0.0D, (double) player.getEyeHeight() * 0.75D, 0.0D)
                    .add(player.getLookAngle().scale(0.3f));
            Vec3 centerOffset = new Vec3(0.0D, 0.0D, 0.0D);
            pos = pos.add(VectorHelper.getVectorForRotation(-90.0F, player.getViewYRot(0)).scale(centerOffset.y))
                    .add(VectorHelper.getVectorForRotation(0, player.getViewYRot(0) + 90).scale(centerOffset.z))
                    .add(player.getLookAngle().scale(centerOffset.z));
            EntityDrive drive = new EntityDrive(SlashBlade.RegistryEvents.Drive, player.level());

            player.level().addFreshEntity(drive);

            drive.setBaseSize(50);
            drive.getDimensions(Pose.STANDING).scale(18,18);
            drive.getPersistentData().putBoolean("modao",true);


            drive.setPos(pos.x, pos.y, pos.z);
            drive.setDamage(5f);
            drive.setSpeed(1.2f);
            drive.shoot(player.getLookAngle().x, player.getLookAngle().y, player.getLookAngle().z, drive.getSpeed(), 0);
            drive.setColor(5177599);
            drive.setOwner(player);

            drive.setLifetime(60);
            List<Vec3> vl = PathGenerator.generatePath(Vec3.atCenterOf(player.blockPosition()), Vec3.atCenterOf(target.blockPosition()));
            for (Vec3 v : vl){
                if (player.level() instanceof ServerLevel serverLevel){
                    serverLevel.sendParticles(ParticleTypes.DRAGON_BREATH, v.x(), v.y(), v.z(), 4, 0.3, 0.3, 0.3, 0.1);
                    {
                        final Vec3 _center = v;
                        List<Entity> _entfound = serverLevel.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), a -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
                        for (Entity entityiterator : _entfound) {
                            if (entityiterator != player) {
                                if (entityiterator instanceof LivingEntity) {
                                    player.heal((float) (player.getMaxHealth()*0.01));
                                    entityiterator.invulnerableTime = 0;
                                    entityiterator.hurt(new DamageSource(serverLevel.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC), player), (float) (player.getAttributeValue(Attributes.ATTACK_DAMAGE)*1.5+2));
                                }
                            }
                        }
                    }
                }
            }
            player.teleportTo(target.getX(), target.getY(), target.getZ());
            SMoveUtil.sendDashMessage(player,0,1.2);
           // player.lookAt(EntityAnchorArgument.Anchor.EYES, target.position().add(0,0.5,0));

            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 2));
            player.addEffect(new MobEffectInstance(Legendblade.EffectAbout.HIT_DAMAGE.get(), 25, 2));
            target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 3));
            player.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 100, 2));
            player.addEffect(new MobEffectInstance(MobEffects.HUNGER, 30, 5));
            player.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 30, 5));
            player.addEffect(new MobEffectInstance(MobEffects.WITHER, 100, 2));




        }
    }
}
