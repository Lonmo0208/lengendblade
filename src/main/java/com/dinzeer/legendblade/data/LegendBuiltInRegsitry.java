package com.dinzeer.legendblade.data;

import com.dinzeer.legendblade.Legendblade;
import com.dinzeer.legendblade.regsitry.LBSpecialEffectsRegistry;
import com.dinzeer.legendblade.regsitry.LBslashArtRegsitry;
import mods.flammpfeil.slashblade.item.SwordType;
import mods.flammpfeil.slashblade.registry.SlashArtsRegistry;
import mods.flammpfeil.slashblade.registry.slashblade.EnchantmentDefinition;
import mods.flammpfeil.slashblade.registry.slashblade.PropertiesDefinition;
import mods.flammpfeil.slashblade.registry.slashblade.RenderDefinition;
import mods.flammpfeil.slashblade.registry.slashblade.SlashBladeDefinition;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

public class LegendBuiltInRegsitry {
    //伪死念
    public static final ResourceKey<SlashBladeDefinition> NIHILEXFAKE=register("nihilexfake");
    //血腥
    public static final ResourceKey<SlashBladeDefinition> BLOODKATANA=register("bloodkatana");
    //真红
    public static final ResourceKey<SlashBladeDefinition> SHINKU=register("shinku");
    //妖刀「神狐」
    public static final ResourceKey<SlashBladeDefinition> GODFOX=register("godfox");
    //锈迹斑斑的刀
    public static final ResourceKey<SlashBladeDefinition> RUSTGODFOX=register("rustgodfox");
    //木鞘「刃条」
    public static final ResourceKey<SlashBladeDefinition> stickgodfox=register("stickgodfox");
    //御神灵刀「神狐」
    public static final ResourceKey<SlashBladeDefinition> NEOGODFOX=register("neogodfox");
    //木鞘「神狐」
    public static final ResourceKey<SlashBladeDefinition> WHITEGODFOX=register("whitegodfox");
    //御神刀「神狐」
    public static final ResourceKey<SlashBladeDefinition> TRUEGODFOX=register("truegodfox");

    public static void registerAll(BootstapContext<SlashBladeDefinition> bootstrap) {

        bootstrap.register(
                NIHILEXFAKE, new SlashBladeDefinition(Legendblade.prefix("nihilexfake"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/named/nihilexfake/texture.png"))
                                .modelName(Legendblade.prefix("model/named/nihilexfake/model.obj"))
                                .effectColor(16711697)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(10)
                                .maxDamage(80)
                                .build(),
                        List.of()
                ));
        bootstrap.register(
                BLOODKATANA, new SlashBladeDefinition(Legendblade.prefix("bloodkatana"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/named/bloodkatanat/texture.png"))
                                .modelName(Legendblade.prefix("model/named/bloodkatanat/model.obj"))
                                .effectColor(16711697)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(25)
                                .slashArtsType(LBslashArtRegsitry.HPC.getId())
                                .maxDamage(80)
                                .addSpecialEffect(LBSpecialEffectsRegistry.BAdBlood.getId())
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 5),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 5),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 5),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.THORNS), 5)

                        )
                ));
        bootstrap.register(
                SHINKU, new SlashBladeDefinition(Legendblade.prefix("shinku"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/named/shinku/texture.png"))
                                .modelName(Legendblade.prefix("model/named/shinku/model.obj"))
                                .effectColor(16711697)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(25)
                                .slashArtsType(LBslashArtRegsitry.HP.getId())
                                .addSpecialEffect(LBSpecialEffectsRegistry.BLadeAttack.getId())
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 6),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 5),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 5),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.THORNS), 5)

                        )
                ));
        bootstrap.register(
                GODFOX, new SlashBladeDefinition(Legendblade.prefix("godfox"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/named/godfox/texture.png"))
                                .modelName(Legendblade.prefix("model/named/godfox/model.obj"))
                                .effectColor(15906304)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .slashArtsType(LBslashArtRegsitry.MP.getId())
                                .baseAttackModifier(18)
                                .maxDamage(80)
                                .build(),
                        List.of(
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_PROTECTION), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FALL_PROTECTION), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.RESPIRATION), 1)

                        )
                ));

        bootstrap.register(
                RUSTGODFOX, new SlashBladeDefinition(Legendblade.prefix("rustgodfox"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/named/rustgodfox/texture.png"))
                                .modelName(Legendblade.prefix("model/named/rustgodfox/model.obj"))
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(5)
                                .maxDamage(80)
                                .build(),
                        List.of()
                ));

        bootstrap.register(
                stickgodfox, new SlashBladeDefinition(Legendblade.prefix("stickgodfox"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/named/stickgodfox/texture.png"))
                                .modelName(Legendblade.prefix("model/named/stickgodfox/model.obj"))
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(10)
                                .slashArtsType(SlashArtsRegistry.DRIVE_HORIZONTAL.getId())
                                .maxDamage(80)
                                .build(),
                        List.of()
                ));

        bootstrap.register(
                NEOGODFOX, new SlashBladeDefinition(Legendblade.prefix("neogodfox"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/named/neogodfox/texture.png"))
                                .modelName(Legendblade.prefix("model/named/neogodfox/model.obj"))
                                .effectColor(15906304)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .addSpecialEffect(LBSpecialEffectsRegistry.BLESSING.getId())
                                .slashArtsType(LBslashArtRegsitry.PROWESS.getId())
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(30)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 10),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.KNOCKBACK), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.BLOCK_FORTUNE), 4),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.MOB_LOOTING), 5),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_PROTECTION), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FALL_PROTECTION), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.RESPIRATION), 1)
                        )
                ));

        bootstrap.register(
                WHITEGODFOX, new SlashBladeDefinition(Legendblade.prefix("whitegodfox"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/named/whitegodfox/texture.png"))
                                .modelName(Legendblade.prefix("model/named/whitegodfox/model.obj"))
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(12)
                                .slashArtsType(SlashArtsRegistry.DRIVE_VERTICAL.getId())
                                .maxDamage(80)
                                .build(),
                        List.of()
                ));

        bootstrap.register(
                TRUEGODFOX, new SlashBladeDefinition(Legendblade.prefix("truegodfox"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/named/truegodfox/texture.png"))
                                .modelName(Legendblade.prefix("model/named/truegodfox/model.obj"))
                                .effectColor(15906304)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .addSpecialEffect(LBSpecialEffectsRegistry.BLESSING.getId())
                                .slashArtsType(LBslashArtRegsitry.PROWESS.getId())
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(22)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 5),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.KNOCKBACK), 2),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.BLOCK_FORTUNE), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.MOB_LOOTING), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_PROTECTION), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FALL_PROTECTION), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.RESPIRATION), 1)
                        )
                ));




    }








    private static ResourceKey<SlashBladeDefinition> register(String id) {
        return ResourceKey.create(SlashBladeDefinition.REGISTRY_KEY, Legendblade.prefix(id));
    }
    static ResourceLocation getEnchantmentID(Enchantment enchantment) {
        return ForgeRegistries.ENCHANTMENTS.getKey(enchantment);
    }

}
