package com.dinzeer.legendblade.regsitry.specialeffects.linkage;

import cn.mmf.slashblade_addon.SlashBladeAddon;
import cn.mmf.slashblade_addon.specialattacks.FireSpiral;
import cn.mmf.slashblade_addon.specialattacks.WaterDrive;
import com.dinzeer.legendblade.regsitry.linkage.SBALBSlashArtRegsitry;
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
public class FireDancy  extends SpecialEffect {
    public FireDancy() {
        super(40,false,false);
    }
    @SubscribeEvent
    public static void onDoingSlash(SlashBladeEvent.DoSlashEvent event) {
        if(ModList.get().isLoaded(SlashBladeAddon.MODID)) {
            ISlashBladeState state = event.getSlashBladeState();
            if (state.hasSpecialEffect(SBALBSlashArtRegsitry.FireDancy.getId())) {
                if (!(event.getUser() instanceof Player)) {
                    return;
                }

                Player player = (Player)event.getUser();
                RandomSource random = player.getRandom();
                int level = player.experienceLevel;
                if (SpecialEffect.isEffective(SBALBSlashArtRegsitry.FireDancy.get(), level)) {
                    if(random.nextInt(100)>=80){


                            FireSpiral.doCircleSlash(player, -30.0F, 180.0F);
                            FireSpiral.doCircleSlash(player, -30.0F, 90.0F);
                            FireSpiral.doCircleSlash(player, -30.0F, 0.0F);
                            FireSpiral.doCircleSlash(player, -30.0F, -90.0F);
                }
                }
            }
        }
    }
}
