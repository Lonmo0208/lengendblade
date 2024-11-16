package com.dinzeer.legendblade.regsitry;

import com.dinzeer.legendblade.Legendblade;
import com.dinzeer.legendblade.specialattack.DriveSumon;
import com.dinzeer.legendblade.specialattack.MonsterPower;
import com.dinzeer.legendblade.specialattack.Prowess;
import com.dinzeer.legendblade.specialattack.SommonSwordSommon;
import mods.flammpfeil.slashblade.SlashBlade;
import mods.flammpfeil.slashblade.ability.StunManager;
import mods.flammpfeil.slashblade.init.DefaultResources;
import mods.flammpfeil.slashblade.registry.combo.ComboState;
import mods.flammpfeil.slashblade.slasharts.Drive;
import mods.flammpfeil.slashblade.util.AttackManager;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.dinzeer.legendblade.Legendblade.MODID;

public class LBComboRegsitry {
    public static final DeferredRegister<ComboState> COMBO_STATES =
            DeferredRegister.create(ComboState.REGISTRY_KEY,MODID);



    public static final RegistryObject<ComboState> ALL_REUSE = COMBO_STATES.register
            (
                    "all_reuse",
                    ComboState.Builder.newInstance().startAndEnd(459, 488).priority(50)
                            .motionLoc(DefaultResources.ExMotionLocation).next(entity -> SlashBlade.prefix("none"))
                            .nextOfTimeout(entity -> SlashBlade.prefix("none"))
                            .addTickAction(ComboState.TimeLineTickAction.getBuilder().put(0, AttackManager::playQuickSheathSoundAction).build())
                            .releaseAction(ComboState::releaseActionQuickCharge)::build
            );

    public static final RegistryObject<ComboState> PROWESS = COMBO_STATES.register("prowess",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(2, (entityIn) -> AttackManager.doSlash(entityIn, -30F, Vec3.ZERO, false, false, 0.1F))
                            .put(3, Prowess::doSlash).build())
                    .addHitEffect(StunManager::setStun)
                    ::build);
    public static final RegistryObject<ComboState> MP = COMBO_STATES.register("monster_power",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(2, (entityIn) -> AttackManager.doSlash(entityIn, -30F, Vec3.ZERO, false, false, 0.1F))
                            .put(3, MonsterPower::doSlash).build())
                    .addHitEffect(StunManager::setStun)
                    ::build);
    public static final RegistryObject<ComboState> HP = COMBO_STATES.register("heart_slash",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(1,(entityIn) -> SommonSwordSommon.doSlash(entityIn,false,10,1F))
                            .put(2, (entityIn) -> AttackManager.doSlash(entityIn, -30F, Vec3.ZERO, false, false, 1F))
                            .put(3, (entityIn) -> Drive.doSlash(entityIn,0,20,Vec3.ZERO,false,5F,1F))
                            .put(4, (entityIn) -> AttackManager.doSlash(entityIn, 30F, Vec3.ZERO, false, false, 1F))
                            .put(5, (entityIn) -> Drive.doSlash(entityIn,90,20,Vec3.ZERO,false,5F,1F))
                            .put(6, (entityIn) -> AttackManager.doSlash(entityIn, 180F, Vec3.ZERO, false, false, 1F))
                            .put(7, (entityIn) -> Drive.doSlash(entityIn,45,20,Vec3.ZERO,false,5F,1F))
                            .put(8,(entityIn) -> SommonSwordSommon.doSlash(entityIn,false,10,1F))
                            .put(9,(entityIn) -> SommonSwordSommon.doSlash(entityIn,false,10,1F))
                            .build())
                    .addHitEffect(StunManager::setStun)
                    ::build);
    public static final RegistryObject<ComboState> HPC = COMBO_STATES.register("heart_slash_c",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(1,(entityIn) -> SommonSwordSommon.doSlash(entityIn,false,15,1F))
                            .put(2, (entityIn) -> AttackManager.doSlash(entityIn, -30F, Vec3.ZERO, false, false, 1F))
                            .put(3, (entityIn) -> Drive.doSlash(entityIn,0,20,Vec3.ZERO,false,5F,1F))
                            .put(4, (entityIn) -> AttackManager.doSlash(entityIn, 30F, Vec3.ZERO, false, false, 1F))
                            .put(5, (entityIn) -> Drive.doSlash(entityIn,90,20,Vec3.ZERO,false,5F,1F))
                            .put(6, (entityIn) -> AttackManager.doSlash(entityIn, 180F, Vec3.ZERO, false, false, 1F))
                            .put(7, (entityIn) -> Drive.doSlash(entityIn,45,20,Vec3.ZERO,false,5F,1F))
                            .put(8, (entityIn) -> AttackManager.doSlash(entityIn, 90F, Vec3.ZERO, false, false, 1F))
                            .put(9, (entityIn) -> Drive.doSlash(entityIn,-45,20,Vec3.ZERO,false,5F,1F))
                            .build())
                    .addHitEffect(StunManager::setStun)
                    ::build);


}
