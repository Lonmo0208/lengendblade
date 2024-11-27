package com.dinzeer.legendblade.regsitry;

import com.dinzeer.legendblade.Legendblade;
import com.dinzeer.legendblade.Util.GetNumUtil;
import com.dinzeer.legendblade.specialattack.*;
import com.dinzeer.legendblade.specialattack.HungerAbsorption;
import mods.flammpfeil.slashblade.SlashBlade;
import mods.flammpfeil.slashblade.ability.StunManager;
import mods.flammpfeil.slashblade.init.DefaultResources;
import mods.flammpfeil.slashblade.registry.combo.ComboState;
import mods.flammpfeil.slashblade.slasharts.CircleSlash;
import mods.flammpfeil.slashblade.slasharts.Drive;
import mods.flammpfeil.slashblade.slasharts.JudgementCut;
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
    public static final RegistryObject<ComboState> Phantomthrust = COMBO_STATES.register("phantom_thrust",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(2, (entityIn) -> AttackManager.doSlash(entityIn, -30F, Vec3.ZERO, false, false, 0.1F))
                            .put(3, (entityIn) -> PhantomThrust.doSlash(entityIn,2F*3))
                            .put(9, (entityIn) -> PhantomThrust.doSlash(entityIn,2F*-3))
                            .build())
                    .addHitEffect(StunManager::setStun)
                    ::build);
    public static final RegistryObject<ComboState> Soul_Lock = COMBO_STATES.register("soul_lock",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(2, (entityIn) -> AttackManager.doSlash(entityIn, -30F, Vec3.ZERO, false, false, 0.1F))
                            .put(3, (entityIn) -> PhantomThrust.doSlash(entityIn,2F*-3))
                            .build())
                    .addHitEffect(StunManager::setStun)
                    ::build);
    public static final RegistryObject<ComboState> thatcher = COMBO_STATES.register("thatcher",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(2, (entityIn) -> AttackManager.doSlash(entityIn, -30F, Vec3.ZERO, false, false, 0.1F))
                            .put(3, (entityIn) -> Thatcher.doSlash(entityIn,2F))
                            .put(4, (entityIn) -> CircleSlash.doCircleSlashAttack(entityIn, 180))
                            .put(5, (entityIn) -> CircleSlash.doCircleSlashAttack(entityIn, 90))
                            .put(6, (entityIn) -> CircleSlash.doCircleSlashAttack(entityIn, 0))
                            .put(7, (entityIn) -> CircleSlash.doCircleSlashAttack(entityIn, -90))
                            .build())
                    .addHitEffect(StunManager::setStun)
                    ::build);
    public static final RegistryObject<ComboState> HungerA = COMBO_STATES.register("hunger_absorption",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(2, (entityIn) -> AttackManager.doSlash(entityIn, -30F, Vec3.ZERO, false, false, 0.1F))
                            .put(3, (entityIn) -> HungerAbsorption.doSlash(entityIn,2F))
                            .build())
                    .addHitEffect(StunManager::setStun)
                    ::build);
    public static final RegistryObject<ComboState> splitapart = COMBO_STATES.register("split_apart",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(2, (entityIn) -> AttackManager.doSlash(entityIn, -30F, Vec3.ZERO, false, false, 0.1F))
                            .put(3, (entityIn) -> Splitapart.doSlash(entityIn,2F))
                            .build())
                    .addHitEffect(StunManager::setStun)
                    ::build);
    public static final RegistryObject<ComboState> greedyGrip = COMBO_STATES.register("greedy_grip",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(1, (entityIn) -> AttackManager.doSlash(entityIn, 30F, Vec3.ZERO, false, false, 0.1F))
                            .put(2, (entityIn) -> DriveSumon.doSlash(entityIn, 45F, 20, Vec3.ZERO, false, 15, 1f, 1f, 2, GetNumUtil.getcolor(entityIn)))
                            .put(3, (entityIn) -> AttackManager.doSlash(entityIn, -30F, Vec3.ZERO, false, false, 0.1F))
                            .put(4, (entityIn) -> DriveSumon.doSlash(entityIn, -45F, 20, Vec3.ZERO, false, 15, 1f, 1f, 2,GetNumUtil.getcolor(entityIn)))
                            .put(5, JudgementCut::doJudgementCut)
                            .put(6, GreedyGrip::doSlash)
                            .build())
                    .addHitEffect(StunManager::setStun)
                    ::build);
    public static final RegistryObject<ComboState> flurry  = COMBO_STATES.register("flurry",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(1, (entityIn) -> AttackManager.doSlash(entityIn, 30F, Vec3.ZERO, false, false, 0.1F))
                            .put(2, (entityIn) -> DriveSumon.doSlash(entityIn, 45F, 20, Vec3.ZERO, false, 15, 1f, 1f, 2, GetNumUtil.getcolor(entityIn)))
                            .put(3, (entityIn) -> DriveSumon.doSlash(entityIn, -45F, 20, Vec3.ZERO, false, 15, 1f, 1f, 2, GetNumUtil.getcolor(entityIn)))
                            .put(4, (entityIn) -> DriveSumon.doSlash(entityIn, 90F, 20, Vec3.ZERO, false, 15, 1f, 1f, 2,GetNumUtil.getcolor(entityIn)))
                            .put(5, (entityIn) -> DriveSumon.doSlash(entityIn, 45F, 20, Vec3.ZERO, false, 15, 1f, 1f, 2, GetNumUtil.getcolor(entityIn)))
                            .put(6, (entityIn) -> DriveSumon.doSlash(entityIn, -45F, 20, Vec3.ZERO, false, 15, 1f, 1f, 2, GetNumUtil.getcolor(entityIn)))
                            .put(7, (entityIn) -> DriveSumon.doSlash(entityIn, 90F, 20, Vec3.ZERO, false, 15, 1f, 1f, 2,GetNumUtil.getcolor(entityIn)))
                            .put(8, (entityIn) -> DriveSumon.doSlash(entityIn, 45F, 20, Vec3.ZERO, false, 15, 1f, 1f, 2, GetNumUtil.getcolor(entityIn)))
                            .put(9, (entityIn) -> DriveSumon.doSlash(entityIn, -45F, 20, Vec3.ZERO, false, 15, 1f, 1f, 2, GetNumUtil.getcolor(entityIn)))
                            .put(10, (entityIn) -> DriveSumon.doSlash(entityIn, 90F, 20, Vec3.ZERO, false, 15, 1f, 1f, 2,GetNumUtil.getcolor(entityIn)))

                            .build())
                    .addHitEffect(StunManager::setStun)
                    ::build);
    public static final RegistryObject<ComboState> MPSS = COMBO_STATES.register("monster_power_sommonsword",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(2, (entityIn) -> AttackManager.doSlash(entityIn, -30F, Vec3.ZERO, false, false, 0.1F))
                            .put(3, MonsterPower::doSlash)
                            .put(4, (entityIn) -> SommonSwordSommon.doSlash(entityIn,false,15,1F))
                            .build())
                    .addHitEffect(StunManager::setStun)
                    ::build);

    public static final RegistryObject<ComboState> VoidSlashPlus = COMBO_STATES.register("voidslashplus",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(1, JudgementCut::doJudgementCut)
                            .put(5, JudgementCut::doJudgementCut)
                            .build())
                    .addHitEffect(StunManager::setStun)
                    ::build);

    public static final RegistryObject<ComboState> Thrust = COMBO_STATES.register("thrust",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(1, (entityIn) -> PhantomThrust.doSlash(entityIn,3F*3))
                            .build())
                    .addHitEffect(StunManager::setStun)
                    ::build);





}
