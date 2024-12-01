package com.dinzeer.legendblade.event;

import com.dinzeer.legendblade.Config;
import com.dinzeer.legendblade.entity.DriveSummonEntity;
import mods.flammpfeil.slashblade.SlashBlade;
import mods.flammpfeil.slashblade.init.SBItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber
public class DamageFixer {
@SubscribeEvent
    public static void onDamage(LivingHurtEvent event) {
      if (Config.Open_damege_fix)
        if (event.getSource().getEntity() instanceof Player owner)
        {
            if (ForgeRegistries.ITEMS.getKey(owner.getMainHandItem().getItem()).toString().equals("slashblade:slashblade")) {

                double distance = owner.getOnPos().getCenter().distanceTo(event.getEntity().getOnPos().getCenter());

                if (distance < 5) {
                    event.setAmount((float) (event.getAmount() * 0.5 * ((5 - distance) * 0.2)));
                }
            }
        }
}

}
