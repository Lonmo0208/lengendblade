package com.dinzeer.legendblade.events;

import com.dinzeer.legendblade.regsitry.other.LBModItems;
import mods.flammpfeil.slashblade.capability.slashblade.ISlashBladeState;
import mods.flammpfeil.slashblade.event.SlashBladeEvent;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class SoulCrystalFunction {
    @SubscribeEvent
    public static void hitBladeShelf(SlashBladeEvent.BladeStandAttackEvent event){
        if (event.getDamageSource().getEntity() instanceof Player player){
            if (player.getMainHandItem().getItem() == LBModItems.soul_crystal.get()){
                event.setCanceled(true);
                player.getMainHandItem().shrink(1);
                ISlashBladeState slashBladeState = event.getSlashBladeState();
                slashBladeState.setKillCount(slashBladeState.getKillCount()+100);
                slashBladeState.setProudSoulCount(slashBladeState.getProudSoulCount()+300);
                slashBladeState.setRefine(slashBladeState.getRefine()+1);
                slashBladeState.setMaxDamage(slashBladeState.getMaxDamage()+1);
                slashBladeState.setColorCode(slashBladeState.getColorCode()+1);
            }
        }
    }
}
