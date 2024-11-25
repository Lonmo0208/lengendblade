package com.dinzeer.legendblade.specialattack;

import com.dinzeer.legendblade.Util.SMoveUtil;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class Splitapart {


    public static void doSlash(LivingEntity playerIn, float speed) {

        SMoveUtil.sendDashMessage((Player) playerIn,0,speed);
        playerIn.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100, 3));
        playerIn.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 1));
        playerIn.setHealth(playerIn.getHealth()-8);


    }
}
