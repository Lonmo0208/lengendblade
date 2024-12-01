package com.dinzeer.legendblade.specialattack;


import com.dinzeer.legendblade.entity.DriveSummonEntity;
import com.dinzeer.legendblade.entity.SumonSwordEntity;
import com.dinzeer.legendblade.regsitry.LBEntiteRegristrys;
import mods.flammpfeil.slashblade.SlashBlade;
import mods.flammpfeil.slashblade.capability.concentrationrank.CapabilityConcentrationRank;
import mods.flammpfeil.slashblade.capability.concentrationrank.ConcentrationRankCapabilityProvider;
import mods.flammpfeil.slashblade.capability.slashblade.ISlashBladeState;
import mods.flammpfeil.slashblade.entity.EntitySlashEffect;
import mods.flammpfeil.slashblade.item.ItemSlashBlade;
import mods.flammpfeil.slashblade.util.VectorHelper;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import static twilightforest.util.TFItemStackUtils.damage;

public class Thatcher {
    public static void doSlash(LivingEntity playerIn, float speed)
    {
        int colorCode = playerIn.getMainHandItem().getCapability(ItemSlashBlade.BLADESTATE).map(ISlashBladeState::getColorCode).orElse(0xFF3333FF);
        doSlash(playerIn,speed,colorCode);
    }

    public static void doSlash(LivingEntity playerIn, float speed,int colorCode) {


        if (playerIn.level().isClientSide()) return;

        playerIn.getMainHandItem().getCapability(ItemSlashBlade.BLADESTATE).ifPresent((state) -> {

            Level worldIn = playerIn.level();

              int count = 8;

            for (int i = 0; i < count; i++)
            {
                SumonSwordEntity ss = new SumonSwordEntity(LBEntiteRegristrys.ss, worldIn);

                worldIn.addFreshEntity(ss);

                ss.setSpeed(speed);
                ss.setIsCritical(false);
                ss.setOwner(playerIn);
                ss.setColor(colorCode);
                ss.setRoll(0);
                ss.setDamage(10);
                // force riding
                ss.startRiding(playerIn, true);
                //a 注释
                ss.setDelay(10+i);

                boolean isRight = ss.getDelay() % 2 == 0;
                RandomSource random = worldIn.getRandom();

                double xOffset = random.nextDouble() * 2.5 * (isRight ? 1 : -1);
                double yOffset = random.nextFloat() * 2;
                double zOffset = random.nextFloat() * 0.5;

                ss.setPos(playerIn.position().add(xOffset, yOffset, zOffset));
                ss.setOffset(new Vec3(xOffset, yOffset, zOffset));

                playerIn.playSound(SoundEvents.CHORUS_FRUIT_TELEPORT, 0.2F, 1.45F);
            }
        });


       playerIn.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 100, 0));


    }



}
