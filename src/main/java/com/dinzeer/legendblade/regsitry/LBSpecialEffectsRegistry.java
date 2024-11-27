package com.dinzeer.legendblade.regsitry;

import com.dinzeer.legendblade.regsitry.specialeffects.*;
import mods.flammpfeil.slashblade.registry.specialeffects.SpecialEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

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
    public LBSpecialEffectsRegistry() {
    }

    static {
        REGISTRY_KEY2 = DeferredRegister.create(SpecialEffect.REGISTRY_KEY, MODID);
        BLESSING=REGISTRY_KEY2.register("blessing", Blessing::new);
        BLadeAttack=REGISTRY_KEY2.register("blade_attack", BladeAttack::new);
        BAdBlood=REGISTRY_KEY2.register("bad_blood", BadBlood::new);
        Sin=REGISTRY_KEY2.register("sin", Sin::new);
        poison=REGISTRY_KEY2.register("poison", Poison::new);
        Feastful=REGISTRY_KEY2.register("feastful", Feastful::new);
        Shackles=REGISTRY_KEY2.register("shackles", Shackles::new);
        Resentment=REGISTRY_KEY2.register("resentment", Resentment::new);
        Suppress=REGISTRY_KEY2.register("suppress", Suppress::new);
        Endless=REGISTRY_KEY2.register("endless", Endless::new);
        Bloodthirsty=REGISTRY_KEY2.register("bloodthirsty", Bloodthirsty::new);
        BlessingSummonSword=REGISTRY_KEY2.register("blessingsummonsword", BlessingSummonSword::new);
        SummonSword=REGISTRY_KEY2.register("summonsword", SummonSword::new);
        FoxBlessing=REGISTRY_KEY2.register("foxbling", FoxBlessing::new);
    }
}
