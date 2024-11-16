package com.dinzeer.legendblade.regsitry;

import com.dinzeer.legendblade.regsitry.specialeffects.BadBlood;
import com.dinzeer.legendblade.regsitry.specialeffects.BladeAttack;
import com.dinzeer.legendblade.regsitry.specialeffects.Blessing;
import mods.flammpfeil.slashblade.registry.specialeffects.SpecialEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.dinzeer.legendblade.Legendblade.MODID;

public class LBSpecialEffectsRegistry {
    public static final DeferredRegister<SpecialEffect> REGISTRY_KEY2;
    public static final RegistryObject<SpecialEffect> BLESSING;
    public static final RegistryObject<SpecialEffect> BLadeAttack;
    public static final RegistryObject<SpecialEffect> BAdBlood;
    public LBSpecialEffectsRegistry() {
    }

    static {
        REGISTRY_KEY2 = DeferredRegister.create(SpecialEffect.REGISTRY_KEY, MODID);
        BLESSING=REGISTRY_KEY2.register("blessing", Blessing::new);
        BLadeAttack=REGISTRY_KEY2.register("blade_attack", BladeAttack::new);
        BAdBlood=REGISTRY_KEY2.register("bad_blood", BadBlood::new);
    }
}
