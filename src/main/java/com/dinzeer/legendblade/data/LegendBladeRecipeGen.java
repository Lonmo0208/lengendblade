package com.dinzeer.legendblade.data;

import com.dinzeer.legendblade.init.LBModItems;
import com.tterrag.registrate.providers.RegistrateRecipeProvider;
import com.tterrag.registrate.util.DataIngredient;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.function.BiFunction;

public class LegendBladeRecipeGen {
    public static void onRecipeGen(RegistrateRecipeProvider pvd) {
        unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, LBModItems.saligiaex, 1)::unlockedBy, Items.IRON_INGOT)
                .pattern("ABC")
                .pattern(" D ")
                .pattern("EFG")
                .define('A', LBModItems.acedia)
                .define('B',LBModItems.avaritia)
                .define('C',LBModItems.gula)
                .define('D', LBModItems.ira)
                .define('E', LBModItems.invidia)
                .define('F',LBModItems.superbia)
                .define('G', LBModItems.luxuria)
                .save(pvd);

//        unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CFItems.FORGE_TABLE.get().asItem(), 1)::unlockedBy, Items.IRON_INGOT)
//                .pattern("CIC").pattern("PCP").pattern("PCP")
//                .define('P', ItemTags.PLANKS)
//                .define('C', Items.COPPER_INGOT)
//                .define('I', Items.IRON_INGOT)
//                .save(pvd);
    }

    public static <T> T unlock(RegistrateRecipeProvider pvd, BiFunction<String, InventoryChangeTrigger.TriggerInstance, T> func, Item item) {
        return func.apply("has_" + pvd.safeName(item), DataIngredient.items(item).getCritereon(pvd));
    }
}
