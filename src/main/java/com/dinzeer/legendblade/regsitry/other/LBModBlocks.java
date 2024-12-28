package com.dinzeer.legendblade.regsitry.other;

import com.dinzeer.legendblade.Block.WonderReactor;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.tags.BlockTags;

import static com.dinzeer.legendblade.Legendblade.REGISTRATE;

public class LBModBlocks {


    public static final RegistryEntry<WonderReactor> wonder_reactor = REGISTRATE.block("wonder_reactor",
            p-> new WonderReactor()  ).tag(

            BlockTags.MINEABLE_WITH_PICKAXE,BlockTags.NEEDS_DIAMOND_TOOL
    ).defaultBlockstate().defaultLang().item().build().register();

    public static void register(){

    }

}
