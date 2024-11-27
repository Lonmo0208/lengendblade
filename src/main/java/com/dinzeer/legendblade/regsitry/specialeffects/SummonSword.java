package com.dinzeer.legendblade.regsitry.specialeffects;

import com.dinzeer.legendblade.Util.GetNumUtil;
import com.dinzeer.legendblade.regsitry.LBSpecialEffectsRegistry;
import com.dinzeer.legendblade.specialattack.BlessingsummonSword;
import com.dinzeer.legendblade.specialattack.SommonSwordSommon;
import mods.flammpfeil.slashblade.capability.slashblade.ISlashBladeState;
import mods.flammpfeil.slashblade.event.SlashBladeEvent;
import mods.flammpfeil.slashblade.registry.specialeffects.SpecialEffect;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class SummonSword extends SpecialEffect {
    public SummonSword() {
        super(60,false,false);
    }
    @SubscribeEvent
    public static void onDoingSlash(SlashBladeEvent.DoSlashEvent event) {
        ISlashBladeState state = event.getSlashBladeState();
        if (state.hasSpecialEffect(LBSpecialEffectsRegistry.SummonSword.getId())) {
            if (!(event.getUser() instanceof Player)) {
                return;
            }

            Player player = (Player)event.getUser();
            RandomSource random = player.getRandom();
            int level = player.experienceLevel;
            if (SpecialEffect.isEffective(LBSpecialEffectsRegistry.SummonSword.get(), level)) {

                    SommonSwordSommon.doSlash(player,14540253,false, 0.5,1F);
                    SommonSwordSommon.doSlash(player,14540253,false, 0.5,1F);


            }
        }

    }
}
