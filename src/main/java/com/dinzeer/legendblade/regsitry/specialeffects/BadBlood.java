package com.dinzeer.legendblade.regsitry.specialeffects;

import com.dinzeer.legendblade.regsitry.LBSpecialEffectsRegistry;
import mods.flammpfeil.slashblade.capability.slashblade.ISlashBladeState;
import mods.flammpfeil.slashblade.event.SlashBladeEvent;
import mods.flammpfeil.slashblade.registry.specialeffects.SpecialEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class BadBlood extends SpecialEffect {
    public BadBlood() {
        super(60,true,true);
    }
    @SubscribeEvent
    public static void onSlashBladeHit(SlashBladeEvent.HitEvent event) {
        ISlashBladeState state = event.getSlashBladeState();
        if (state.hasSpecialEffect(LBSpecialEffectsRegistry.BAdBlood.getId())) {
            if (!(event.getUser() instanceof Player)) {
                return;
            }

            Player player = (Player)event.getUser();
            int level = player.experienceLevel;
            if (SpecialEffect.isEffective((SpecialEffect)LBSpecialEffectsRegistry.BAdBlood.get(), level)) {
                event.getTarget().addEffect(new MobEffectInstance(MobEffects.HARM, 10, 1));
                event.getTarget().addEffect(new MobEffectInstance(MobEffects.POISON, 20, 1));
                event.getTarget().addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 60, 1));
            }
        }

    }

}
