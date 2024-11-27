package com.dinzeer.legendblade.specialattack;

import com.dinzeer.legendblade.entity.SumonSwordEntity;
import com.dinzeer.legendblade.regsitry.LBEntiteRegristrys;
import mods.flammpfeil.slashblade.item.ItemSlashBlade;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class BlessingsummonSword {
    public static void doSlash(LivingEntity playerIn, boolean critical, double damage, float speed)
    {
        int colorCode = playerIn.getMainHandItem().getCapability(ItemSlashBlade.BLADESTATE).map(state -> state.getColorCode()).orElse(0xFF3333FF);
        doSlash(playerIn, colorCode, critical, damage, speed);
    }

    public static void doSlash(LivingEntity playerIn, int colorCode, boolean critical, double damage, float speed)
    {
        if (playerIn.level().isClientSide()) return;

        playerIn.getMainHandItem().getCapability(ItemSlashBlade.BLADESTATE).ifPresent((state) -> {

            Level worldIn = playerIn.level();


                SumonSwordEntity ss = new SumonSwordEntity(LBEntiteRegristrys.ss, worldIn);

                worldIn.addFreshEntity(ss);

                ss.setSpeed(speed);
                ss.setIsCritical(critical);
                ss.setOwner(playerIn);
                ss.setColor(colorCode);
                ss.setRoll(0);
                ss.setDamage(damage);
                // force riding
                ss.startRiding(playerIn, true);

                ss.setDelay(20);

                boolean isRight = ss.getDelay() % 2 == 0;
                RandomSource random = worldIn.getRandom();

            double xOffset = random.nextDouble() * 2.5 * (double)(isRight ? 1 : -1);
            double yOffset = (double)(random.nextFloat() * 2.0F);
            double zOffset = (double)random.nextFloat() * 0.5;
            ss.setPos(playerIn.position().add(xOffset, yOffset, zOffset));
            ss.setOffset(new Vec3(xOffset, yOffset, zOffset));

                playerIn.playSound(SoundEvents.CHORUS_FRUIT_TELEPORT, 0.2F, 1.45F);

        });
    }
}
