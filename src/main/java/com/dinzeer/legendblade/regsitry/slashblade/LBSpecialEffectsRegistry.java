package com.dinzeer.legendblade.regsitry.slashblade;

import com.dinzeer.legendblade.specialeffects.godfox.Blessing;
import com.dinzeer.legendblade.specialeffects.versionone.*;
import com.dinzeer.legendblade.specialeffects.versiontwo.Bloodfox;
import com.dinzeer.legendblade.specialeffects.godfox.*;
import com.dinzeer.legendblade.specialeffects.heartblade.*;
import mods.flammpfeil.slashblade.registry.specialeffects.SpecialEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import com.dinzeer.legendblade.specialeffects.versiontwo.*;

import static com.dinzeer.legendblade.Legendblade.MODID;

public class LBSpecialEffectsRegistry {
    public static final DeferredRegister<SpecialEffect> REGISTRY_KEY2;
    public static final RegistryObject<SpecialEffect> BLESSING;
    public static final RegistryObject<SpecialEffect> BLadeAttack;
    public static final RegistryObject<SpecialEffect> BAdBlood;
    public static final RegistryObject<SpecialEffect> Sin;
    public static final RegistryObject<SpecialEffect> poison;
    public static final RegistryObject<SpecialEffect> Feastful;
    public static final RegistryObject<SpecialEffect> Shackles;
    public static final RegistryObject<SpecialEffect> Resentment;
    public static final RegistryObject<SpecialEffect> Suppress;
    public static final RegistryObject<SpecialEffect> Endless;
    public static final RegistryObject<SpecialEffect> Bloodthirsty;
    public static final RegistryObject<SpecialEffect> BlessingSummonSword;
    public static final RegistryObject<SpecialEffect> SummonSword;
    public static final RegistryObject<SpecialEffect> FoxBlessing;
    public static final RegistryObject<SpecialEffect> Liuli;
    public static final RegistryObject<SpecialEffect> Liulione;
    public static final RegistryObject<SpecialEffect> EndSakuraRiseUp;
    public static final RegistryObject<SpecialEffect> TheShineSummonSword;
    public static final RegistryObject<SpecialEffect> WaveEdgeRiseUp;
    public static final RegistryObject<SpecialEffect> FragmentedEdge;
    public static final RegistryObject<SpecialEffect> bloodfox;
    public static final RegistryObject<SpecialEffect> RainBow;
    public static final RegistryObject<SpecialEffect> Eternal;
    public static final RegistryObject<SpecialEffect> Need;
    public static final RegistryObject<SpecialEffect> MaxSky;
    public static final RegistryObject<SpecialEffect> Shinening;
    public static final RegistryObject<SpecialEffect> DarkGod;
    public static final RegistryObject<SpecialEffect> Zain;
    public static final RegistryObject<SpecialEffect> EnduranceTower;
    public static final RegistryObject<SpecialEffect> SanNight;
    public static final RegistryObject<SpecialEffect> VoidMaker;
    public LBSpecialEffectsRegistry() {
    }

    static {
        REGISTRY_KEY2 = DeferredRegister.create(SpecialEffect.REGISTRY_KEY, MODID);
        BLESSING=REGISTRY_KEY2.register("blessing", Blessing::new);//神佑
        BLadeAttack=REGISTRY_KEY2.register("blade_attack", BladeAttack::new);//刃噬
        BAdBlood=REGISTRY_KEY2.register("bad_blood", BadBlood::new);//坏血
        Sin=REGISTRY_KEY2.register("sin", Sin::new);
        poison=REGISTRY_KEY2.register("poison", Poison::new);
        Feastful=REGISTRY_KEY2.register("feastful", Feastful::new);
        Shackles=REGISTRY_KEY2.register("shackles", Shackles::new);
        Resentment=REGISTRY_KEY2.register("resentment", Resentment::new);
        Suppress=REGISTRY_KEY2.register("suppress", Suppress::new);
        Endless=REGISTRY_KEY2.register("endless", Endless::new);
        Bloodthirsty=REGISTRY_KEY2.register("bloodthirsty", Bloodthirsty::new);
        BlessingSummonSword=REGISTRY_KEY2.register("blessingsummonsword",BlessingSummonSword::new);
        SummonSword=REGISTRY_KEY2.register("summonsword", SummonSword::new);
        FoxBlessing=REGISTRY_KEY2.register("foxbling", FoxBlessing::new);
        Liuli=REGISTRY_KEY2.register("liuli", Liuli::new);
        Liulione=REGISTRY_KEY2.register("liulione", Liulione::new);
        EndSakuraRiseUp=REGISTRY_KEY2.register("endsakurateriseup", EndSakuraRiseUp::new);
        WaveEdgeRiseUp=REGISTRY_KEY2.register("waveedgeriseup", WaveEdgeRiseUp::new);//波刀龙胆se
        TheShineSummonSword=REGISTRY_KEY2.register("theshine",TheShine::new);
        FragmentedEdge=REGISTRY_KEY2.register("fragmentededge", FragmentedEdge::new);
        bloodfox=REGISTRY_KEY2.register("bloodfox", Bloodfox::new);
        RainBow=REGISTRY_KEY2.register("rainbow", RainBow::new);
        Eternal=REGISTRY_KEY2.register("eternal", Eternal::new);
        Need=REGISTRY_KEY2.register("need", Need::new);
        MaxSky=REGISTRY_KEY2.register("maxsky", MaxSky::new);
        Shinening=REGISTRY_KEY2.register("shinening", Shinening::new);
        DarkGod=REGISTRY_KEY2.register("darkgod",DarkGod::new);
        Zain=REGISTRY_KEY2.register("zain",Zain::new);
        EnduranceTower=REGISTRY_KEY2.register("endurancetower", EnduranceTower::new);
        SanNight=REGISTRY_KEY2.register("sannight",SanNight::new);
        VoidMaker=REGISTRY_KEY2.register("voidmaker",VoidMaker::new);
    }
}
