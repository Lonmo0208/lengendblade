package com.dinzeer.legendblade.regsitry.specialeffects.compat;

import cn.mmf.slashblade_addon.SlashBladeAddon;
import cn.mmf.slashblade_addon.specialattacks.WaterDrive;
import com.dinzeer.legendblade.regsitry.compat.SBALBSlashArtRegsitry;
import mods.flammpfeil.slashblade.capability.slashblade.ISlashBladeState;
import mods.flammpfeil.slashblade.event.SlashBladeEvent;
import mods.flammpfeil.slashblade.registry.specialeffects.SpecialEffect;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Terrifyingwaves extends SpecialEffect {
    public Terrifyingwaves() {
        super(40,false,false);
    }
    @SubscribeEvent
    public static void onDoingSlash(SlashBladeEvent.DoSlashEvent event) {
        if(ModList.get().isLoaded(SlashBladeAddon.MODID)) {
        ISlashBladeState state = event.getSlashBladeState();
        if (state.hasSpecialEffect(SBALBSlashArtRegsitry.Terrifyingwaves.getId())) {
            if (!(event.getUser() instanceof Player)) {
                return;
            }

            Player player = (Player)event.getUser();
            RandomSource random = player.getRandom();
            int level = player.experienceLevel;
            if (SpecialEffect.isEffective(SBALBSlashArtRegsitry.Terrifyingwaves.get(), level)) {

                WaterDrive.doSlash(player,event.getRoll(),20, Vec3.ZERO,false,event.getDamage()+1,3F);
                WaterDrive.doSlash(player,event.getRoll(),20, Vec3.ZERO,false,event.getDamage()+1,3F);

            }
        }
        }
    }
}