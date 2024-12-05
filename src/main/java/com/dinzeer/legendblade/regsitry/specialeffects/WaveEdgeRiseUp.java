package com.dinzeer.legendblade.regsitry.specialeffects;

import com.dinzeer.legendblade.regsitry.LBSpecialEffectsRegistry;
import com.exfantasy.mclib.Utils.SlashBlade.SlashEffectUtils;
import mods.flammpfeil.slashblade.capability.slashblade.ISlashBladeState;
import mods.flammpfeil.slashblade.event.SlashBladeEvent;
import mods.flammpfeil.slashblade.registry.specialeffects.SpecialEffect;
import mods.flammpfeil.slashblade.slasharts.Drive;
import mods.flammpfeil.slashblade.slasharts.SakuraEnd;
import mods.flammpfeil.slashblade.slasharts.WaveEdge;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class WaveEdgeRiseUp extends SpecialEffect {
    public WaveEdgeRiseUp() {
        super(60,false,false);
    }
    @SubscribeEvent
    public static void onDoingSlash(SlashBladeEvent.DoSlashEvent event) {

        ISlashBladeState state = event.getSlashBladeState();
        if (state.hasSpecialEffect(LBSpecialEffectsRegistry.WaveEdgeRiseUp.getId())) {
            if (!(event.getUser() instanceof Player)) {
                return;
            }

            Player player = (Player)event.getUser();
            RandomSource random = player.getRandom();
            int level = player.experienceLevel;
            if (SpecialEffect.isEffective(LBSpecialEffectsRegistry.WaveEdgeRiseUp.get(), level)) {
                if(random.nextInt(100)>=90){
                    WaveEdge.doSlash(player,event.getRoll(),30,Vec3.ZERO,false,event.getDamage()*2,1F,3F,5);
                }
            }
        }
    }
}
