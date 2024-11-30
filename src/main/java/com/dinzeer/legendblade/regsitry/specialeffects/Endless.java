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
public class Endless extends SpecialEffect {
   public Endless(){
       super(30,false,false);
   }
   @SubscribeEvent

   public  static  void blaze(SlashBladeEvent.UpdateEvent event){
       ISlashBladeState state = event.getSlashBladeState();
       if(state.hasSpecialEffect(LBSpecialEffectsRegistry.Endless.getId())) {
           if (!(event.getEntity() instanceof Player)) {
               return;
           }

           if(!event.isSelected())
               return;

           Player player = (Player) event.getEntity();

           int level = player.experienceLevel;

           if(SpecialEffect.isEffective(LBSpecialEffectsRegistry.Endless.get(),level)){

               player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 300, 1));
           }
       }
   }
}