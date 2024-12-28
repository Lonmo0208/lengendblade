package com.dinzeer.legendblade.mixins;

import com.dinzeer.legendblade.regsitry.slashblade.LBslashArtRegsitry;
import mods.flammpfeil.slashblade.capability.slashblade.ISlashBladeState;
import mods.flammpfeil.slashblade.event.SlashBladeEvent;
import mods.flammpfeil.slashblade.event.bladestand.BlandStandEventHandler;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BlandStandEventHandler.class)
public abstract class AginstSpSaDrop {
    @Inject(method = "eventCopySA",at = @At("HEAD"),cancellable = true,remap = false)
    private static void eventCopySA(SlashBladeEvent.BladeStandAttackEvent event, CallbackInfo ci) {
        if (event.getDamageSource().getEntity() instanceof Player) {
            ISlashBladeState state = event.getSlashBladeState();
            if (state.getSlashArtsKey().toString().equals(LBslashArtRegsitry.LastMoondrive.getId().toString())){
                ci.cancel();
                return;
            }

        }
    }

}
