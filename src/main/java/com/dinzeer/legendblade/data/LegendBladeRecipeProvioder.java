package com.dinzeer.legendblade.data;

import cn.mmf.slashblade_addon.data.SlashBladeAddonBuiltInRegistry;
import com.dinzeer.legendblade.init.LBModItems;
import mods.flammpfeil.slashblade.init.SBItems;
import mods.flammpfeil.slashblade.recipe.RequestDefinition;
import mods.flammpfeil.slashblade.recipe.SlashBladeIngredient;
import mods.flammpfeil.slashblade.recipe.SlashBladeShapedRecipeBuilder;
import mods.flammpfeil.slashblade.registry.slashblade.EnchantmentDefinition;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

public class LegendBladeRecipeProvioder extends RecipeProvider implements IConditionBuilder {

    public LegendBladeRecipeProvioder(PackOutput output) {
        super(output);
    }
    protected void buildRecipes(Consumer<FinishedRecipe> consumer){


        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.NIHILEXFAKE.location())
                .pattern("ABC")
                .pattern("BDB")
                .pattern("EBA")
                .define('A', SBItems.proudsoul_ingot)
                .define('B', Items.IRON_BLOCK)
                .define('C',  SBItems.proudsoul_crystal)
                .define('E', LBModItems.blood_tachi)
                .define('D',SBItems.slashblade)
                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.SHINKU.location())
                .pattern("ABC")
                .pattern("DEF")
                .pattern("GHA")
                .define('A', SBItems.proudsoul_sphere)
                .define('B', LBModItems.jadeofuda)
                .define('C', LBModItems.lightpinkjadeofuda)
                .define('D',LBModItems.crimsonjadeofuda)
                .define('E',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.NIHILEXFAKE.location())
                                .proudSoul(25000)
                                .killCount(5000)
                                .refineCount(20)
                                .build()
                ))
                .define('F', LBModItems.redjadeofuda)
                .define('G', LBModItems.pinkjadeofuda)
                .define('H', LBModItems.scarletjadeofuda)

                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.BLOODKATANA.location())
                .pattern("ABC")
                .pattern("DEF")
                .pattern("GHA")
                .define('A', SBItems.proudsoul_sphere)
                .define('B', LBModItems.iron_tachi)
                .define('C', LBModItems.lightred_tachi)
                .define('D',LBModItems.red_tachi)
                .define('E',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.NIHILEXFAKE.location())
                                .proudSoul(25000)
                                .killCount(5000)
                                .refineCount(20)
                                .addEnchantment(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 1))
                                .addEnchantment(new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 1))
                                .addEnchantment(new EnchantmentDefinition(getEnchantmentID(Enchantments.THORNS), 1))
                                .build()
                ))
                .define('F', LBModItems.sored_tachi)
                .define('G', LBModItems.blood_tachi)
                .define('H', LBModItems.slightlyred_tachi)

                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.stickgodfox.location())
                .pattern("AB ")
                .pattern("CDC")
                .pattern(" EA")
                .define('A', Items.REDSTONE)
                .define('B', Items.FLINT)
                .define('C', Items.IRON_INGOT)
                .define('D',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.RUSTGODFOX.location())
                                .proudSoul(500)
                                .refineCount(1)
                                 .build()
                ))
                .define('E',Items.STICK)
                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.WHITEGODFOX.location())
                .pattern("ABA")
                .pattern("ACA")
                .pattern("ADA")
                .define('A', SBItems.proudsoul_ingot)
                .define('B', Items.OAK_LOG)

                .define('C',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.stickgodfox.location())
                                .killCount(500)
                                .proudSoul(2500)
                                .refineCount(5)
                                .build()
                ))
                .define('D', Items.OAK_SLAB)
                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);

        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.GODFOX.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("ABA")
                .define('A', SBItems.proudsoul_ingot)
                .define('B', LBModItems.tearfluorite)
                .define('C', Items.NETHER_STAR)
                .define('D',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.WHITEGODFOX.location())
                                .killCount(500)
                                .proudSoul(10000)
                                .refineCount(10)
                                .build()
                ))

                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.TRUEGODFOX.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("ABA")
                .define('A', SBItems.proudsoul_ingot)
                .define('C', LBModItems.tearfluorite)
                .define('B', Items.NETHER_STAR)
                .define('D',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.GODFOX.location())
                                .killCount(1200)
                                .proudSoul(25000)
                                .refineCount(10)
                                .build()
                ))

                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
//        SlashBladeShapedRecipeBuilder.shaped(SlashBladeAddonBuiltInRegistry.NIHILBX.location())
//
//                .pattern("ABA")
//                .pattern("ACA")
//                .pattern("ADA")
//                .define('A', Items.DIAMOND_BLOCK)
//                .define('B', SlashBladeIngredient.of(
//                        RequestDefinition.Builder.newInstance()
//                                .name(SlashBladeAddonBuiltInRegistry.NIHILUL.location())
//                                .killCount(3000)
//
//                                .refineCount(20)
//                                .build()
//                ))
//                .define('C', SlashBladeIngredient.of(
//                        RequestDefinition.Builder.newInstance()
//                                .name(LegendBuiltInRegsitry.NIHILEXFAKE.location())
//                                .killCount(3000)
//                                .refineCount(20)
//                                .build()
//                ))
//                .define('D',SBItems.proudsoul_sphere)
//
//
//                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);


    }



    static ResourceLocation getEnchantmentID(Enchantment enchantment) {
        return ForgeRegistries.ENCHANTMENTS.getKey(enchantment);
    }
    public Item getItem(ResourceLocation item) {
        return ForgeRegistries.ITEMS.getValue(item);
    }
}
