package com.dinzeer.legendblade.regsitry;

import mods.flammpfeil.slashblade.slasharts.SlashArts;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.dinzeer.legendblade.Legendblade.MODID;

public class LBslashArtRegsitry {
    public static final DeferredRegister<SlashArts> SLASH_ARTS =
            DeferredRegister.create(SlashArts.REGISTRY_KEY, MODID);

    public static final RegistryObject<SlashArts> PROWESS;
    public static final RegistryObject<SlashArts> MP;
    public static final RegistryObject<SlashArts> HP;
    public static final RegistryObject<SlashArts> HPC;
    static {
        PROWESS=SLASH_ARTS.register("prowess", () -> new SlashArts((e) ->
                LBComboRegsitry.PROWESS.getId()));
        MP=SLASH_ARTS.register("monster_power", () -> new SlashArts((e) ->
                LBComboRegsitry.MP.getId()));
        HP=SLASH_ARTS.register("heart_slash", () -> new SlashArts((e) ->LBComboRegsitry.HP.getId()));
        HPC=SLASH_ARTS.register("heart_slashc", () -> new SlashArts((e) ->LBComboRegsitry.HPC.getId()));
    }
}
