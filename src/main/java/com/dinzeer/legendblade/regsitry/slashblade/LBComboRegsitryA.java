package com.dinzeer.legendblade.regsitry.slashblade;

import com.dinzeer.legendblade.Legendblade;
import com.dinzeer.legendblade.specialattack.versionone.PhantomThrust;
import com.dinzeer.legendblade.specialattack.versionone.Thrusts;
import com.dinzeer.legendblade.specialattack.versiontwo.*;
import com.exfantasy.mclib.Utils.SlashBlade.SlashEffectUtils;
import mods.flammpfeil.slashblade.SlashBlade;
import mods.flammpfeil.slashblade.ability.StunManager;
import mods.flammpfeil.slashblade.event.client.UserPoseOverrider;
import mods.flammpfeil.slashblade.init.DefaultResources;
import mods.flammpfeil.slashblade.registry.combo.ComboState;
import mods.flammpfeil.slashblade.slasharts.CircleSlash;
import mods.flammpfeil.slashblade.slasharts.Drive;
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
    public static final RegistryObject<ComboState> MoonDrive = COMBO_STATES.register("moondrive",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(1, (entityIn) -> AttackManager.doSlash(entityIn, -30F, Vec3.ZERO, false, false, 0.1F))
                            .put(2, (entityIn) -> MoonDriveSumon.doSlash(entityIn,90,20,Vec3.ZERO,false,5F,1F,1F,1,0))
                            .build())
                    .addHitEffect(StunManager::setStun)
                    ::build);
    public static final RegistryObject<ComboState> FrogGlaxy = COMBO_STATES.register("frog_glaxy",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(1, (entityIn) -> AttackManager.doSlash(entityIn, -30F, Vec3.ZERO, false, false, 0.1F))
                            .put(2, Glaxy::doSlash)
                            .build())
                    .addHitEffect(StunManager::setStun)
                    ::build);
    public static final RegistryObject<ComboState> saveall = COMBO_STATES.register("save_all",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(1, (entityIn) -> AttackManager.doSlash(entityIn, -30F, Vec3.ZERO, false, false, 0.1F))
                            .put(2,(entityIn) -> SaveAll.doSlash(entityIn,false,-1,2F,10))
                            .put(3,(entityIn) -> SaveAll.doSlash(entityIn,false,-1,1.5F,10))
                            .put(4,(entityIn) -> SaveAll.doSlash(entityIn,false,-1,1F,10))
                            .build())
                    .addHitEffect(StunManager::setStun)
                    ::build);
    public static final RegistryObject<ComboState> elbowstrike = COMBO_STATES.register("elbowstrike",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(1, (entityIn) -> AttackManager.doSlash(entityIn, -30F, Vec3.ZERO, false, false, 0.1F))
                            .put(2, Elbowstrike::doSlash)
                            .build())
                    .addHitEffect(StunManager::setStun)
                    ::build);
    public static final RegistryObject<ComboState> swordRain = COMBO_STATES.register("sword_rain",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(1, (entityIn) -> AttackManager.doSlash(entityIn, -30F, Vec3.ZERO, false, false, 0.1F))
                            .put(2, (entityIn) -> SwordRain.doSlash(entityIn,true,2.5F,3F))
                            .put(3, (entityIn) -> SwordRain.doSlash(entityIn,true,2.5F,3F))
                            .put(4, (entityIn) -> SwordRain.doSlash(entityIn,true,2.5F,3F))
                            .put(5, (entityIn) -> SwordRain.doSlash(entityIn,true,2.5F,3F))
                            .put(6, (entityIn) -> SwordRain.doSlash(entityIn,true,2.5F,3F))
                            .put(7, (entityIn) -> SwordRain.doSlash(entityIn,true,2.5F,3F))
                            .put(8, (entityIn) -> SwordRain.doSlash(entityIn,true,2.5F,3F))
                            .build())
                    .addHitEffect(StunManager::setStun)
                    ::build);

    public static final RegistryObject<ComboState> lastMoondrive = COMBO_STATES.register("lastmoondrive",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(1, (entityIn) -> AttackManager.doSlash(entityIn, -30F, Vec3.ZERO, false, false, 0.1F))
                            .put(2,(entityIn) -> LastMoondrive.doSlash(entityIn,Vec3.ZERO))
                            .build())
                    .addHitEffect(StunManager::setStun)
                    ::build);
    public static final RegistryObject<ComboState> MoonDriveEX = COMBO_STATES.register("moondriveex",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(1, (entityIn) -> AttackManager.doSlash(entityIn, -30F, Vec3.ZERO, false, false, 0.1F))
                            .put(2, (entityIn) -> EXmoonDrive.doSlash(entityIn,Vec3.ZERO))
                            .put(3, (entityIn) -> EXmoonDrive.doSlash(entityIn,Vec3.ZERO))
                            .put(4, (entityIn) -> EXmoonDrive.doSlash(entityIn,Vec3.ZERO))
                            .put(5, (entityIn) -> EXmoonDrive.doSlash(entityIn,Vec3.ZERO))
                            .put(6, (entityIn) -> EXmoonDrive.doSlash(entityIn,Vec3.ZERO))
                            .build())
                    .addHitEffect(StunManager::setStun)
                    ::build);
    public static final RegistryObject<ComboState> eXmoonDrive =MoonDriveEX;
    public static final RegistryObject<ComboState> sommonSwordSommonEX = COMBO_STATES.register("sommon_sword_sommonex",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(1, (entityIn) -> AttackManager.doSlash(entityIn, -30F, Vec3.ZERO, false, false, 0.1F))
                            .put(2, (entityIn) -> SommonSwordSommonEX.doSlash(entityIn,false,10,3F))
                            .build())
                    .addHitEffect(StunManager::setStun)
                    ::build);




    public static final RegistryObject<ComboState> SAKURA_END_LEFTEX2 = COMBO_STATES.register("sakura_end_left_ex1",
            ComboState.Builder.newInstance().startAndEnd(1816, 1859).speed(6F).priority(50)
                    .next((entity) -> Legendblade.prefix("sakura_end_right_ex2"))
                    .nextOfTimeout(entity -> Legendblade.prefix("sakura_end_right_ex2"))
                    .clickAction((entityIn) -> AttackManager.doSlash(entityIn, 22.5F, Vec3.ZERO, false, false, SlashEffectUtils.addslashbladesaDamage(entityIn,2)))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .build())
                    .addHitEffect(StunManager::setStun)::build);

    public static final RegistryObject<ComboState> SAKURA_END_RIGHTEX = COMBO_STATES.register("sakura_end_right_ex2",
            ComboState.Builder.newInstance().startAndEnd(204, 218).speed(1.1F).priority(50)
                    .next((entity) -> Legendblade.prefix("circle_slash"))
                    .nextOfTimeout(entity -> Legendblade.prefix("circle_slash"))
                    .clickAction((entityIn) -> AttackManager.doSlash(entityIn, 180F - 22.5F, Vec3.ZERO, false, true, SlashEffectUtils.addslashbladesaDamage(entityIn,2)))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .build())
                    .addHitEffect((t, a) -> StunManager.setStun(t, 36))::build);



    public static final RegistryObject<ComboState> CIRCLE_SLASH9 = COMBO_STATES.register("circle_slash",
            ComboState.Builder.newInstance().startAndEnd(725, 743).priority(50)
                    .next(entity -> SlashBlade.prefix("circle_slash"))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(4, (entityIn) -> CircleSlash.doCircleSlashAttack(entityIn, 180))
                            .put(5, (entityIn) -> CircleSlash.doCircleSlashAttack(entityIn, 90))
                            .put(6, (entityIn) -> CircleSlash.doCircleSlashAttack(entityIn, 0))
                            .put(7, (entityIn) -> CircleSlash.doCircleSlashAttack(entityIn, -90)).build())
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(7 - 3 + 0, (entityIn) -> UserPoseOverrider.setRot(entityIn, 72, true))
                            .put(7 - 3 + 1, (entityIn) -> UserPoseOverrider.setRot(entityIn, 72, true))
                            .put(7 - 3 + 2, (entityIn) -> UserPoseOverrider.setRot(entityIn, 72, true))
                            .put(7 - 3 + 3, (entityIn) -> UserPoseOverrider.setRot(entityIn, 72, true))
                            .put(7 - 3 + 4, (entityIn) -> UserPoseOverrider.setRot(entityIn, 72, true))
                            .put(7 - 3 + 5, (entityIn) -> UserPoseOverrider.resetRot(entityIn)).build())
                    .addHitEffect(StunManager::setStun)::build);

    public static final RegistryObject<ComboState> thrust = COMBO_STATES.register("for_thrust",
            ComboState.Builder.newInstance().startAndEnd(400, 459).priority(50)
                    .motionLoc(DefaultResources.ExMotionLocation)
                    .next(ComboState.TimeoutNext.buildFromFrame(15, entity -> SlashBlade.prefix("none")))
                    .nextOfTimeout(entity -> Legendblade.prefix("all_reuse"))
                    .addTickAction(ComboState.TimeLineTickAction.getBuilder()
                            .put(2, (entityIn) -> AttackManager.doSlash(entityIn, -30F, Vec3.ZERO, false, false, SlashEffectUtils.addslashbladesaDamage(entityIn,1)))
                            .put(3, (entityIn) -> PhantomThrust.doThrust(entityIn,2F))
                            .build())
                    .addHitEffect(StunManager::setStun)
                    ::build);





}
