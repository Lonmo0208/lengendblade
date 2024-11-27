package com.dinzeer.legendblade.regsitry.specialeffects;

import cn.mmf.slashblade_addon.registry.SBASpecialEffectsRegistry;
import com.dinzeer.legendblade.Util.GetNumUtil;
import com.dinzeer.legendblade.regsitry.LBSpecialEffectsRegistry;
import com.dinzeer.legendblade.specialattack.BlessingsummonSword;
import mods.flammpfeil.slashblade.capability.slashblade.ISlashBladeState;
import mods.flammpfeil.slashblade.event.SlashBladeEvent;
import mods.flammpfeil.slashblade.registry.specialeffects.SpecialEffect;
import mods.flammpfeil.slashblade.slasharts.Drive;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class BlessingSummonSword extends SpecialEffect {
    public BlessingSummonSword() {
        super(60,false,false);
    }
    @SubscribeEvent
    public static void onDoingSlash(SlashBladeEvent.DoSlashEvent event) {
        ISlashBladeState state = event.getSlashBladeState();
        if (state.hasSpecialEffect(LBSpecialEffectsRegistry.BlessingSummonSword.getId())) {
            if (!(event.getUser() instanceof Player)) {
                return;
            }

            Player player = (Player)event.getUser();
            RandomSource random = player.getRandom();
            int level = player.experienceLevel;
            if (SpecialEffect.isEffective(LBSpecialEffectsRegistry.BlessingSummonSword.get(), level)) {
                if (random.nextInt(100) >= 70){
                    BlessingsummonSword.doSlash(player,false, GetNumUtil.getdamage(player),1F);
                }

            }
        }

    }
}
