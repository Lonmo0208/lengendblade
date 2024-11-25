package com.dinzeer.legendblade.event;

import com.dinzeer.legendblade.init.LBModItems;
import com.dinzeer.legendblade.regsitry.LBSpecialEffectsRegistry;
import mods.flammpfeil.slashblade.capability.slashblade.ISlashBladeState;
import mods.flammpfeil.slashblade.event.SlashBladeEvent;
import mods.flammpfeil.slashblade.registry.specialeffects.SpecialEffect;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.*;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;

@Mod.EventBusSubscriber
public class entitydrop {

/*    public static void onSlashBladeUpdate(SlashBladeEvent.UpdateEvent event) {
        ISlashBladeState state = event.getSlashBladeState();
        if(state.hasSpecialEffect(YASpecialEffectsRegistry.VERY_GREEN.getId())) {
            if (!(event.getEntity() instanceof Player)) {
                return;
            }

            if(!event.isSelected())
                return;

            Player player = (Player) event.getEntity();

            int level = player.experienceLevel;

            if(SpecialEffect.isEffective(YASpecialEffectsRegistry.VERY_GREEN.get(),level)){
                player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1));
            }
        }
    }*/
public static boolean hasSpecialEffect(ItemStack stack, String effect) {
        CompoundTag tag = stack.getOrCreateTag(); // 获取或创建NBT标签

        if (tag.contains("bladeState")) { // 检查是否存在ForgeCaps标签
            CompoundTag forgeCaps = tag.getCompound("bladeState");

                if (forgeCaps.contains("SpecialEffects")) { // 检查SpecialEffects标签
                    ListTag specialEffects = forgeCaps.getList("SpecialEffects",8); // 8表示String类型
                    for (int i = 0; i < specialEffects.size(); i++) {
                        String currentEffect = specialEffects.getString(i);
                        if (effect.equals(currentEffect)) {
                            return true; // 找到了指定的特殊效果
                        }
                    }

            }

    }
    return false; // 没有找到指定的特殊效果
}
    @SubscribeEvent
    public static void PiglinDead(LivingDropsEvent e){
        if (e.getEntity() instanceof Piglin b){
                Random r = new Random();
                Level level = b.level();
                int v = r.nextInt(100);
                if (e.getSource().getDirectEntity() instanceof Player player) {
                    if (!hasSpecialEffect(player.getMainHandItem(), "legendblade:sin"))return;
                    int lv = player.experienceLevel;
                    if (level.isClientSide) return;
                    if (SpecialEffect.isEffective(LBSpecialEffectsRegistry.Sin.get(), lv)) {

                        ItemStack p_32005_ = new ItemStack(LBModItems.avaritia.get());
                        p_32005_.setCount(1);
                        level.addFreshEntity(new ItemEntity(level, b.getX(), b.getY() + 1, b.getZ()
                                , p_32005_));
                    }
                }
            }

    }
    @SubscribeEvent
    public static void EnderManDead(LivingDropsEvent e){
        if (e.getEntity() instanceof EnderMan b){
            Random r = new Random();
            Level level = b.level();
            int v=r.nextInt(100);
            if (e.getSource().getDirectEntity() instanceof Player player){
                if (!hasSpecialEffect(player.getMainHandItem(), "legendblade:sin"))return;
                int lv=player.experienceLevel;
                if(level.isClientSide)return;
                if (SpecialEffect.isEffective(LBSpecialEffectsRegistry.Sin.get(), lv)){

                    ItemStack p_32005_ = new ItemStack(LBModItems.superbia.get());
                    p_32005_.setCount(1);
                    level.addFreshEntity(new ItemEntity(level,b.getX(),b.getY()+1,b.getZ()
                            , p_32005_));
                }
            }
        }
    }
    @SubscribeEvent
    public static void BlazeDead(LivingDropsEvent e){
        if (e.getEntity() instanceof Blaze b){
            Level level = b.level();
            Random r = new Random();
            int v=r.nextInt(100);
            if (e.getSource().getDirectEntity() instanceof Player player){
                if (!hasSpecialEffect(player.getMainHandItem(), "legendblade:sin"))return;
                int lv=player.experienceLevel;
                if(level.isClientSide)return;
                if (SpecialEffect.isEffective(LBSpecialEffectsRegistry.Sin.get(), lv)){

                    ItemStack p_32005_ = new ItemStack(LBModItems.ira.get());
                    p_32005_.setCount(1);
                    level.addFreshEntity(new ItemEntity(level,b.getX(),b.getY()+1,b.getZ()
                            , p_32005_));
                }
            }
        }
    }
    @SubscribeEvent
    public static void ZombieDead(LivingDropsEvent e){
        if (e.getEntity() instanceof Zombie b){
            Level level = b.level();
            Random r = new Random();
            int v=r.nextInt(100);
            if (e.getSource().getDirectEntity() instanceof Player player){
                if (!hasSpecialEffect(player.getMainHandItem(), "legendblade:sin"))return;
                int lv=player.experienceLevel;
                if(level.isClientSide)return;
                if (SpecialEffect.isEffective(LBSpecialEffectsRegistry.Sin.get(), lv)){

                    ItemStack p_32005_ = new ItemStack(LBModItems.gula.get());
                    p_32005_.setCount(1);
                    level.addFreshEntity(new ItemEntity(level,b.getX(),b.getY()+1,b.getZ()
                            , p_32005_));}

            }
        }
    }
    @SubscribeEvent
    public static void WitherDead(LivingDropsEvent e){
        if (e.getEntity() instanceof WitherBoss b){
            Level level = b.level();
            Random r = new Random();
            int v=r.nextInt(100);
            if (e.getSource().getDirectEntity() instanceof Player player){
                if (!hasSpecialEffect(player.getMainHandItem(), "legendblade:sin"))return;
                int lv=player.experienceLevel;
                if(level.isClientSide)return;
                if (SpecialEffect.isEffective(LBSpecialEffectsRegistry.Sin.get(), lv)){

                    ItemStack p_32005_ = new ItemStack(LBModItems.invidia.get());
                    p_32005_.setCount(1);
                    level.addFreshEntity(new ItemEntity(level,b.getX(),b.getY()+1,b.getZ()
                            , p_32005_));
                }
            }
        }
    }
    @SubscribeEvent
    public static void SliverDead(LivingDropsEvent e){
        if (e.getEntity() instanceof Silverfish b){
            Level level = b.level();
            if (e.getSource().getDirectEntity() instanceof Player player){
                if (!hasSpecialEffect(player.getMainHandItem(), "legendblade:sin"))return;
                int lv=player.experienceLevel;
                if(level.isClientSide)return;
                if (SpecialEffect.isEffective(LBSpecialEffectsRegistry.Sin.get(), lv)){

                    ItemStack p_32005_ = new ItemStack(LBModItems.acedia.get());
                    p_32005_.setCount(1);
                    level.addFreshEntity(new ItemEntity(level,b.getX(),b.getY()+1,b.getZ()
                            , p_32005_));
                }
            }
        }
    }
    @SubscribeEvent
    public static void WitcheDead(LivingDropsEvent e){
        if (e.getEntity() instanceof Witch b){
            Level level = b.level();
            if (e.getSource().getDirectEntity() instanceof Player player){
                if (!hasSpecialEffect(player.getMainHandItem(), "legendblade:sin"))return;
                int lv=player.experienceLevel;
                if(level.isClientSide)return;
                if (SpecialEffect.isEffective(LBSpecialEffectsRegistry.Sin.get(), lv)){

                    ItemStack p_32005_ = new ItemStack(LBModItems.luxuria.get());
                    p_32005_.setCount(1);
                    level.addFreshEntity(new ItemEntity(level,b.getX(),b.getY()+1,b.getZ()
                            , p_32005_));
                }
            }
        }
    }
}
