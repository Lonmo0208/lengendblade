package com.dinzeer.legendblade.data;

import cn.mmf.slashblade_addon.data.SlashBladeAddonBuiltInRegistry;
import com.dinzeer.legendblade.regsitry.LBModItems;
import mods.flammpfeil.slashblade.data.builtin.SlashBladeBuiltInRegistry;
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
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.evil.location())
                .pattern(" A ")
                .pattern("BCB")
                .pattern("DAD")
                .define('A', Items.IRON_INGOT)
                .define('C', SBItems.slashblade)
                .define('B', Items.REDSTONE)
                .define('D',Items.OBSIDIAN)

                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.asmodeus.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("EBE")
                .define('A', Items.POPPY)
                .define('B', Items.DANDELION)
                .define('C', SBItems.proudsoul_sphere)
                .define('D',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.evil.location())
                                .killCount(1000)
                                .proudSoul(1500)
                                .refineCount(10)
                                .build()
                ))
                .define('E',Items.REDSTONE_LAMP)
                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.beelzebub.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("EBE")
                .define('A', Items.COOKED_PORKCHOP)
                .define('B', Items.COOKED_BEEF)
                .define('C', SBItems.proudsoul_sphere)
                .define('D',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.evil.location())
                                .killCount(1000)
                                .proudSoul(1500)
                                .refineCount(10)
                                .build()
                ))
                .define('E',Items.CAKE)
                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.belphegor.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("EBE")
                .define('A', Items.BLUE_BED)
                .define('B', Items.POWERED_RAIL)
                .define('C', SBItems.proudsoul_sphere)
                .define('D',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.evil.location())
                                .killCount(1000)
                                .proudSoul(1500)
                                .refineCount(10)
                                .build()
                ))
                .define('E',Items.IRON_DOOR)
                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.leviathan.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("EBE")
                .define('A', Items.BLAZE_ROD)
                .define('B', Items.GHAST_TEAR)
                .define('C', SBItems.proudsoul_sphere)
                .define('D',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.evil.location())
                                .killCount(1000)
                                .proudSoul(1500)
                                .refineCount(10)
                                .build()
                ))
                .define('E',Items.IRON_SWORD)
                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.lucifer.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("EBE")
                .define('A', Items.GLOWSTONE)
                .define('B', Items.NETHER_STAR)
                .define('C', SBItems.proudsoul_sphere)
                .define('D',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.evil.location())
                                .killCount(1000)
                                .proudSoul(1500)
                                .refineCount(10)
                                .build()
                ))
                .define('E',Items.BOOKSHELF)
                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.mammon.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("EBE")
                .define('A', Items.GOLD_BLOCK)
                .define('B', Items.DIAMOND)
                .define('C', SBItems.proudsoul_sphere)
                .define('D',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.evil.location())
                                .killCount(1000)
                                .proudSoul(1500)
                                .refineCount(10)
                                .build()
                ))
                .define('E',Items.EMERALD)
                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.samael.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("EBE")
                .define('A', Items.TNT)
                .define('B', Items.LAVA_BUCKET)
                .define('C', SBItems.proudsoul_sphere)
                .define('D',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.evil.location())
                                .killCount(1000)
                                .proudSoul(1500)
                                .refineCount(10)
                                .build()
                ))
                .define('E',Items.BOW)
                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);

        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.NEOGODFOX.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("EBE")
                .define('A', Items.DIAMOND_BLOCK)
                .define('B', Items.NETHER_STAR)
                .define('C', LBModItems.tearfluorite)
                .define('D',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.GODFOX.location())
                                .killCount(7000)
                                .proudSoul(1500)
                                .refineCount(30)
                                .build()
                ))
                .define('E',Items.GLOWSTONE)
                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);

        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.asmodeusex.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("AEA")
                .define('A', LBModItems.luxuria)
                .define('B', LBModItems.saligiasphere)
                .define('C', SBItems.proudsoul_sphere)
                .define('D',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.asmodeus.location())
                                .killCount(5000)
                                .proudSoul(35000)
                                .refineCount(50)
                                .build()
                ))
                .define('E',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.evilex.location())
                                .build()
                ))
                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.beelzebubex.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("AEA")
                .define('A', LBModItems.gula)
                .define('B', LBModItems.saligiasphere)
                .define('C', SBItems.proudsoul_sphere)
                .define('D',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.beelzebub.location())
                                .killCount(5000)
                                .proudSoul(35000)
                                .refineCount(50)
                                .build()
                ))
                .define('E',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.evilex.location())
                                .build()
                ))
                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);

        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.belphegorex.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("AEA")
                .define('A', LBModItems.acedia)
                .define('B', LBModItems.saligiasphere)
                .define('C', SBItems.proudsoul_sphere)
                .define('D',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.belphegor.location())
                                .killCount(5000)
                                .proudSoul(35000)
                                .refineCount(50)
                                .build()
                ))
                .define('E',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.evilex.location())
                                .build()
                ))
                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.evilex.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("EBE")
                .define('A', Items.REDSTONE_BLOCK)
                .define('B', Items.OBSIDIAN)
                .define('C', SBItems.proudsoul_ingot)
                .define('D',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.evil.location())
                                .killCount(1000)
                                .proudSoul(1500)
                                .refineCount(10)
                                .build()
                ))
                .define('E',Items.REDSTONE_BLOCK)
                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.leviathanex.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("AEA")
                .define('A', LBModItems.invidia)
                .define('B', LBModItems.saligiasphere)
                .define('C', SBItems.proudsoul_sphere)
                .define('D',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.leviathan.location())
                                .killCount(5000)
                                .proudSoul(35000)
                                .refineCount(50)
                                .build()
                ))
                .define('E',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.evilex.location())
                                .build()
                ))
                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.luciferex.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("AEA")
                .define('A', LBModItems.superbia)
                .define('B', LBModItems.saligiasphere)
                .define('C', SBItems.proudsoul_sphere)
                .define('D',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.lucifer.location())
                                .killCount(5000)
                                .proudSoul(35000)
                                .refineCount(50)
                                .build()
                ))
                .define('E',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.evilex.location())
                                .build()
                ))
                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.mammonex.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("AEA")
                .define('A', LBModItems.avaritia)
                .define('B', LBModItems.saligiasphere)
                .define('C', SBItems.proudsoul_sphere)
                .define('D',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.mammon.location())
                                .killCount(5000)
                                .proudSoul(35000)
                                .refineCount(50)
                                .build()
                ))
                .define('E',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.evilex.location())
                                .build()
                ))
                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.samaelex.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("AEA")
                .define('A', LBModItems.ira)
                .define('B', LBModItems.saligiasphere)
                .define('C', SBItems.proudsoul_sphere)
                .define('D',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.samael.location())
                                .killCount(5000)
                                .proudSoul(35000)
                                .refineCount(50)
                                .build()
                ))
                .define('E',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.evilex.location())
                                .build()
                ))
                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.foxex.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("ACA")
                .define('A', Items.GLOWSTONE)
                .define('B', Items.NETHER_STAR)
                .define('C', Items.DIAMOND_BLOCK)
                .define('D',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(SlashBladeBuiltInRegistry.FOX_WHITE.location())
                                .killCount(1000)
                                .proudSoul(12000)
                                .refineCount(6)
                                .build()
                ))

                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.foxex2.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("ACA")
                .define('A', Items.GLOWSTONE)
                .define('B', Items.NETHER_STAR)
                .define('C', Items.DIAMOND_BLOCK)
                .define('D',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(SlashBladeBuiltInRegistry.FOX_BLACK.location())
                                .killCount(1000)
                                .proudSoul(12000)
                                .refineCount(6)
                                .build()
                ))

                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.foxexfinal.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("AEA")
                .define('E', Items.GLOWSTONE)
                .define('B', Items.DRAGON_EGG)
                .define('A', Items.DIAMOND_BLOCK)
                .define('D',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.foxex.location())
                                .killCount(4500)
                                .proudSoul(24000)
                                .refineCount(20)
                                .build()
                ))
                .define('C',Items.OBSIDIAN)

                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);

        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.wujiu.location())
                .pattern("CAB")
                .pattern("ABA")
                .pattern("DAC")
                .define('A', Items.NETHER_STAR)
                .define('B', Items.NETHERITE_INGOT)
                .define('C', SBItems.proudsoul_trapezohedron)
                .define('D',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(SlashBladeBuiltInRegistry.MURAMASA.location())
                                .killCount(10000)
                                .proudSoul(30000)
                                .refineCount(100)
                                .build()
                ))

                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);

        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.belphebubex.location())
                .pattern("ADC")
                .pattern("BEB")
                .pattern("CFA")
                .define('A', LBModItems.gula)
                .define('B', LBModItems.saligiaex)
                .define('C', LBModItems.acedia)
                .define('D',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.belphegor.location())
                                .proudSoul(3000)
                                .refineCount(10)
                                .build()
                ))
                .define('F',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.beelzebub.location())
                                .proudSoul(3000)
                                .refineCount(10)
                                .build()
                ))
                .define('E',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(LegendBuiltInRegsitry.evilex.location())
                                .killCount(2000)
                                .proudSoul(3000)
                                .refineCount(10)
                                .build()
                ))
                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.waterex.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("AEA")
                .define('A', SBItems.proudsoul_sphere)
                .define('D', Items.DIAMOND_BLOCK)
                .define('C', Items .NETHER_STAR)


                .define('B',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(SlashBladeAddonBuiltInRegistry.KAMUY_WATER.location())
                                .killCount(3000)
                                .proudSoul(3000)
                                .refineCount(10)
                                .build()
                ))
                .define('E',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(SlashBladeAddonBuiltInRegistry.KIRISAYA.location())
                                .killCount(3000)
                                .proudSoul(3000)
                                .refineCount(10)
                                .build()
                ))
                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.fireex.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("AEA")
                .define('A', SBItems.proudsoul_sphere)
                .define('D', Items.DIAMOND_BLOCK)
                .define('C', Items.NETHER_STAR)


                .define('B',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(SlashBladeAddonBuiltInRegistry.KAMUY_FIRE.location())
                                .killCount(3000)
                                .proudSoul(3000)
                                .refineCount(10)
                                .build()
                ))
                .define('E',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(SlashBladeAddonBuiltInRegistry.LAEMMLE.location())
                                .killCount(3000)
                                .proudSoul(3000)
                                .refineCount(10)
                                .build()
                ))
                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.lightningex.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("AEA")
                .define('A', SBItems.proudsoul_sphere)
                .define('D', Items.DIAMOND_BLOCK)
                .define('C', Items.NETHER_STAR)


                .define('B',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(SlashBladeAddonBuiltInRegistry.KAMUY_LIGHTING.location())
                                .killCount(3000)
                                .proudSoul(3000)
                                .refineCount(10)
                                .build()
                ))
                .define('E',SlashBladeIngredient.of(
                        RequestDefinition.Builder.newInstance()
                                .name(SlashBladeAddonBuiltInRegistry.GREEN_MIST.location())
                                .killCount(3000)
                                .proudSoul(3000)
                                .refineCount(10)
                                .build()
                ))
                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);
        SlashBladeShapedRecipeBuilder.shaped(LegendBuiltInRegsitry.godbird.location())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("ABA")
                .define('A', Items.VINE)
                .define('B', Items.FEATHER)
                .define('C', SBItems.proudsoul_sphere)


                .define('D',SlashBladeIngredient.of(
                        SBItems.slashblade_white, RequestDefinition.Builder.newInstance()
                                .killCount(2000).refineCount(15).proudSoul(15000).build()
                ))
                .unlockedBy(getHasName(SBItems.slashblade), has(SBItems.slashblade)).save(consumer);

    }



    static ResourceLocation getEnchantmentID(Enchantment enchantment) {
        return ForgeRegistries.ENCHANTMENTS.getKey(enchantment);
    }
    public Item getItem(ResourceLocation item) {
        return ForgeRegistries.ITEMS.getValue(item);
    }
}
