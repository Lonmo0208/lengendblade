package com.dinzeer.legendblade.regsitry.specialeffects;

import cn.mmf.slashblade_addon.SlashBladeAddon;
import cn.mmf.slashblade_addon.specialattacks.LightingSwords;
import com.dinzeer.legendblade.regsitry.LBSpecialEffectsRegistry;
import com.dinzeer.legendblade.regsitry.compat.SBALBSlashArtRegsitry;
import com.exfantasy.mclib.Utils.SlashBlade.SlashEffectUtils;
import mods.flammpfeil.slashblade.capability.slashblade.ISlashBladeState;
import mods.flammpfeil.slashblade.event.SlashBladeEvent;
import mods.flammpfeil.slashblade.registry.specialeffects.SpecialEffect;
import mods.flammpfeil.slashblade.slasharts.Drive;
import mods.flammpfeil.slashblade.slasharts.SakuraEnd;
import mods.flammpfeil.slashblade.util.AttackManager;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class EndSakuraRiseUp extends SpecialEffect {
    public EndSakuraRiseUp() {
        super(30,false,false);
    }
    @SubscribeEvent
    public static void onDoingSlash(SlashBladeEvent.DoSlashEvent event) {

            ISlashBladeState state = event.getSlashBladeState();
            if (state.hasSpecialEffect(LBSpecialEffectsRegistry.EndSakuraRiseUp.getId())) {
                if (!(event.getUser() instanceof Player)) {
                    return;
                }

                Player player = (Player)event.getUser();
                RandomSource random = player.getRandom();
                int level = player.experienceLevel;
                if (SpecialEffect.isEffective(LBSpecialEffectsRegistry.EndSakuraRiseUp.get(), level)) {
                    if(random.nextInt(100)>=50){
                        SakuraEnd.doSlash(player, 22.5F, Vec3.ZERO, false, false,
                                SlashEffectUtils.addslashbladesaDamage(player,2))              ;
                        SakuraEnd.doSlash(player, -22.5F, Vec3.ZERO, false, false,
                                SlashEffectUtils.addslashbladesaDamage(player,2))              ;



                    }
                }
            }
        }
}

