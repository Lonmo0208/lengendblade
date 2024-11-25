package com.dinzeer.legendblade.specialattack;


import com.dinzeer.legendblade.Util.SMoveUtil;
import mods.flammpfeil.slashblade.capability.slashblade.ISlashBladeState;
import mods.flammpfeil.slashblade.item.ItemSlashBlade;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class PhantomThrust {

        public static void doSlash(LivingEntity playerIn, float speed,boolean what)
        {
            int colorCode = playerIn.getMainHandItem().getCapability(ItemSlashBlade.BLADESTATE).map(ISlashBladeState::getColorCode).orElse(0xFF3333FF);
            doSlash(playerIn,speed);
        }

        public static void doSlash(LivingEntity playerIn, float speed) {

            SMoveUtil.sendDashMessage((Player) playerIn,0,speed);




        }





    }

