package com.dinzeer.legendblade.regsitry.slashblade;

import com.dinzeer.legendblade.Legendblade;
import com.dinzeer.legendblade.specialattack.versionone.Thrusts;
import com.dinzeer.legendblade.specialattack.versiontwo.BloodThrusts;
import com.dinzeer.legendblade.specialattack.versiontwo.Sevenbladeslash;
import mods.flammpfeil.slashblade.SlashBlade;
import mods.flammpfeil.slashblade.ability.StunManager;
import mods.flammpfeil.slashblade.init.DefaultResources;
import mods.flammpfeil.slashblade.registry.combo.ComboState;
import mods.flammpfeil.slashblade.util.AttackManager;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import com.dinzeer.legendblade.specialattack.versiontwo.BloodThrusts;
import static com.dinzeer.legendblade.Legendblade.MODID;

public class LBComboRegsitryA {
    public static final DeferredRegister<ComboState> COMBO_STATES =
            DeferredRegister.create(ComboState.REGISTRY_KEY,MODID);
    public static final RegistryObject<ComboState> Bloodthrusts = COMBO_STATES.register("bloodbirdthrust",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(1, (entityIn) -> AttackManager.doSlash(entityIn, -30F, Vec3.ZERO, false, false, 0.1F))
                            .put(2, (entityIn) -> BloodThrusts.doSlash(entityIn,5F))
                            .build())
                    .addHitEffect(StunManager::setStun)
                    ::build);
    public static final RegistryObject<ComboState> sevenbladeslash = COMBO_STATES.register("sevenbladeslash",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(1, (entityIn) -> AttackManager.doSlash(entityIn, -30F, Vec3.ZERO, false, false, 0.1F))
                            .put(2, (entityIn) -> Sevenbladeslash.doSlash(entityIn,5F))
                            .build())
                    .addHitEffect(StunManager::setStun)
                    ::build);
}
