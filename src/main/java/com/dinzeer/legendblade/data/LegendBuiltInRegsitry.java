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
    public static final ResourceKey<SlashBladeDefinition> NIHILEXFAKE;
    //血腥
    public static final ResourceKey<SlashBladeDefinition> BLOODKATANA;
    //真红
    public static final ResourceKey<SlashBladeDefinition> SHINKU;
    //妖刀「神狐」
    public static final ResourceKey<SlashBladeDefinition> GODFOX;
    //锈迹斑斑的刀
    public static final ResourceKey<SlashBladeDefinition> RUSTGODFOX;
    //木鞘「刃条」
    public static final ResourceKey<SlashBladeDefinition> stickgodfox;
    //御神灵刀「神狐」
    public static final ResourceKey<SlashBladeDefinition> NEOGODFOX;
    //木鞘「神狐」
    public static final ResourceKey<SlashBladeDefinition> WHITEGODFOX;
    //御神刀「神狐」
    public static final ResourceKey<SlashBladeDefinition> TRUEGODFOX;
    //恶
    public static final ResourceKey<SlashBladeDefinition> evil;
    //一代色欲
    public static final ResourceKey<SlashBladeDefinition> asmodeus;
    //一代暴食
    public static final ResourceKey<SlashBladeDefinition> beelzebub;
    //一代懒惰
    public static final ResourceKey<SlashBladeDefinition> belphegor;
    //一代嫉妒
    public static final ResourceKey<SlashBladeDefinition> leviathan;
    //一代傲慢
    public static final ResourceKey<SlashBladeDefinition> lucifer;
    //一代贪婪
    public static final ResourceKey<SlashBladeDefinition> mammon;
    //一代愤怒
    public static final ResourceKey<SlashBladeDefinition> samael;
    //EX色欲
    public static final ResourceKey<SlashBladeDefinition> asmodeusex;
    //EX暴食
    public static final ResourceKey<SlashBladeDefinition> beelzebubex;
    //EX懒惰
    public static final ResourceKey<SlashBladeDefinition> belphegorex;
    //EX恶
    public static final ResourceKey<SlashBladeDefinition> evilex;
    //EX嫉妒
    public static final ResourceKey<SlashBladeDefinition> leviathanex;
    //EX傲慢
    public static final ResourceKey<SlashBladeDefinition> luciferex;
    //EX贪婪
    public static final ResourceKey<SlashBladeDefinition> mammonex;
    //EX愤怒
    public static final ResourceKey<SlashBladeDefinition> samaelex;
    //ex白狐
    public static final ResourceKey<SlashBladeDefinition> foxex;
    //ex黑狐
    public static final ResourceKey<SlashBladeDefinition> foxex2;
    //exex灵刃狐月刀
    public static final ResourceKey<SlashBladeDefinition> foxexfinal;
    //无九
    public static final ResourceKey<SlashBladeDefinition> wujiu;
    static {
        SHINKU=register("shinku");
        BLOODKATANA=register("bloodkatana");
        NIHILEXFAKE=register("nihilexfake");
        TRUEGODFOX=register("truegodfox");
        evil=register("evil");
        asmodeus=register("asmodeus");
        beelzebub=register("beelzebub");
        belphegor=register("belphegor");
        leviathan=register("leviathan");
        lucifer=register("lucifer");
        mammon=register("mammon");
        samael=register("samael");
        asmodeusex=register("asmodeusex");
        beelzebubex=register("beelzebubex");
        belphegorex=register("belphegorex");
        leviathanex=register("leviathanex");
        luciferex=register("luciferex");
        mammonex=register("mammonex");
        samaelex=register("samaelex");
        evilex=register("evilex");
        foxex=register("foxex");
        foxex2=register("foxex2");
        foxexfinal=register("foxexfinal");
        GODFOX=register("godfox");
        RUSTGODFOX=register("rustgodfox");
        stickgodfox=register("stickgodfox");
        NEOGODFOX=register("neogodfox");
        WHITEGODFOX=register("whitegodfox");
        wujiu=register("wujiu");
    }
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


        bootstrap.register(
                evil, new SlashBladeDefinition(Legendblade.prefix("evil"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/unnamed/evil.png"))
                                .modelName(Legendblade.prefix("model/unnamed/evil.obj"))
                                .effectColor(14540253)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(10)
                                .addSpecialEffect(LBSpecialEffectsRegistry.Sin.getId())
                                .maxDamage(80)
                                .build(),
                        List.of()
                ));
        bootstrap.register(
                asmodeus, new SlashBladeDefinition(Legendblade.prefix("asmodeus"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/named/asmodeus/asmodeus.png"))
                                .modelName(Legendblade.prefix("model/named/asmodeus/asmodeus.obj"))
                                .effectColor(5898495)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(10)
                                .maxDamage(80)
                                .build(),
                        List.of()
                ));
        bootstrap.register(
                beelzebub, new SlashBladeDefinition(Legendblade.prefix("beelzebub"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/named/beelzebub/beelzebub.png"))
                                .modelName(Legendblade.prefix("model/named/beelzebub/beelzebub.obj"))
                                .effectColor(65298)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(10)
                                .maxDamage(80)
                                .build(),
                        List.of()
                ));
        bootstrap.register(
                belphegor, new SlashBladeDefinition(Legendblade.prefix("belphegor"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/named/belphegor/belphegor.png"))
                                .modelName(Legendblade.prefix("model/named/belphegor/belphegor.obj"))
                                .effectColor(8703)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(10)
                                .maxDamage(80)
                                .build(),
                        List.of()
                ));

        bootstrap.register(
                leviathan, new SlashBladeDefinition(Legendblade.prefix("leviathan"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/named/leviathan/leviathan.png"))
                                .modelName(Legendblade.prefix("model/named/leviathan/leviathan.obj"))
                                .effectColor(65499)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(10)
                                .maxDamage(80)
                                .build(),
                        List.of()
                ));
        bootstrap.register(
                lucifer, new SlashBladeDefinition(Legendblade.prefix("lucifer"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/named/lucifer/lucifer.png"))
                                .modelName(Legendblade.prefix("model/named/lucifer/lucifer.obj"))
                                .effectColor(16514816)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(10)
                                .maxDamage(80)
                                .build(),
                        List.of()
                ));

        bootstrap.register(
                mammon, new SlashBladeDefinition(Legendblade.prefix("mammon"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/named/mammon/mammon.png"))
                                .modelName(Legendblade.prefix("model/named/mammon/mammon.obj"))
                                .effectColor(16737792)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(10)
                                .maxDamage(80)
                                .build(),
                        List.of()
                ));
        bootstrap.register(
                samael, new SlashBladeDefinition(Legendblade.prefix("samael"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/named/samael/samael.png"))
                                .modelName(Legendblade.prefix("model/named/samael/samael.obj"))
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
                asmodeusex, new SlashBladeDefinition(Legendblade.prefix("asmodeusex"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/bladeex/asmodeusex/asmodeusex.png"))
                                .modelName(Legendblade.prefix("model/bladeex/asmodeusex/asmodeusex.obj"))
                                .effectColor(5898495)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(10)
                                .maxDamage(80)
                                .build(),
                        List.of()
                ));
        bootstrap.register(
                beelzebubex, new SlashBladeDefinition(Legendblade.prefix("beelzebubex"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/bladeex/beelzebubex/beelzebubex.png"))
                                .modelName(Legendblade.prefix("model/bladeex/beelzebubex/beelzebubex.obj"))
                                .effectColor(65298)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(10)
                                .maxDamage(80)
                                .build(),
                        List.of()
                ));
        bootstrap.register(
                belphegorex, new SlashBladeDefinition(Legendblade.prefix("belphegorex"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/bladeex/belphegorex/belphegorex.png"))
                                .modelName(Legendblade.prefix("model/bladeex/belphegorex/belphegorex.obj"))
                                .effectColor(8703)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(10)
                                .maxDamage(80)
                                .build(),
                        List.of()
                ));
        bootstrap.register(
                evilex, new SlashBladeDefinition(Legendblade.prefix("evilex"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/bladeex/evilex/evilex.png"))
                                .modelName(Legendblade.prefix("model/bladeex/evilex/evilex.obj"))
                                .effectColor(14540253)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(10)
                                .maxDamage(80)
                                .build(),
                        List.of()
                ));
        bootstrap.register(
                leviathanex, new SlashBladeDefinition(Legendblade.prefix("leviathanex"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/bladeex/leviathanex/leviathanex.png"))
                                .modelName(Legendblade.prefix("model/bladeex/leviathanex/leviathanex.obj"))
                                .effectColor(65499)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(10)
                                .maxDamage(80)
                                .build(),
                        List.of()
                ));
        bootstrap.register(
                luciferex, new SlashBladeDefinition(Legendblade.prefix("luciferex"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/bladeex/luciferex/luciferex.png"))
                                .modelName(Legendblade.prefix("model/bladeex/luciferex/luciferex.obj"))
                                .effectColor(16514816)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(10)
                                .maxDamage(80)
                                .build(),
                        List.of()
                ));
        bootstrap.register(
                mammonex, new SlashBladeDefinition(Legendblade.prefix("mammonex"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/bladeex/mammonex/mammonex.png"))
                                .modelName(Legendblade.prefix("model/bladeex/mammonex/mammonex.obj"))
                                .effectColor(16737792)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(10)
                                .maxDamage(80)
                                .build(),
                        List.of()
                ));
        bootstrap.register(
                samaelex, new SlashBladeDefinition(Legendblade.prefix("samaelex"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/bladeex/samaelex/samaelex.png"))
                                .modelName(Legendblade.prefix("model/bladeex/samaelex/samaelex.obj"))
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
                foxex, new SlashBladeDefinition(Legendblade.prefix("foxex"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/foxex/texture.png"))
                                .modelName(Legendblade.prefix("model/foxex/model.obj"))
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
                foxex2, new SlashBladeDefinition(Legendblade.prefix("foxex2"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/foxex/texture2.png"))
                                .modelName(Legendblade.prefix("model/foxex/model.obj"))
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
                foxexfinal, new SlashBladeDefinition(Legendblade.prefix("foxexfinal"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/foxex/texture3.png"))
                                .modelName(Legendblade.prefix("model/foxex/model2.obj"))
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
                wujiu, new SlashBladeDefinition(Legendblade.prefix("wujiu"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/yaoxing/wujiu.png"))
                                .modelName(Legendblade.prefix("model/yaoxing/wujiu.obj"))
                                .effectColor(16711697)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(10)
                                .maxDamage(80)
                                .build(),
                        List.of()
                ));




    }








    private static ResourceKey<SlashBladeDefinition> register(String id) {
        return ResourceKey.create(SlashBladeDefinition.REGISTRY_KEY, Legendblade.prefix(id));
    }
    static ResourceLocation getEnchantmentID(Enchantment enchantment) {
        return ForgeRegistries.ENCHANTMENTS.getKey(enchantment);
    }

}
