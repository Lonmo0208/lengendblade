package com.dinzeer.legendblade.data;

import com.dinzeer.legendblade.Legendblade;
import com.dinzeer.legendblade.regsitry.LBSpecialEffectsRegistry;
import com.dinzeer.legendblade.regsitry.LBslashArtRegsitry;
import com.dinzeer.legendblade.regsitry.linkage.SBALBSlashArtRegsitry;
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
    //原罪交响曲·贝尔西普
    public static final ResourceKey<SlashBladeDefinition> belphebubex;
    //乌卡EX
    public static final ResourceKey<SlashBladeDefinition> waterex;
    //阿贝EX
    public static final ResourceKey<SlashBladeDefinition> fireex;
    //坎娜EX
    public static final ResourceKey<SlashBladeDefinition> lightningex;
    //魔刀千刃
    public static final ResourceKey<SlashBladeDefinition> sevensword;
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
        belphebubex=register("belphebubex");
        waterex=register("waterex");
        fireex=register("fireex");
        lightningex=register("lightningex");
        sevensword=register("sevensword");
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
                                .addSpecialEffect(LBSpecialEffectsRegistry.BlessingSummonSword.getId())
                                .slashArtsType(LBslashArtRegsitry.MPSS.getId())
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(24)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 10),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.KNOCKBACK), 3),
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
                                .baseAttackModifier(8)
                                .slashArtsType(SlashArtsRegistry.NONE.getId())
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
                                .slashArtsType(LBslashArtRegsitry.PhantomThrust.getId())
                                .baseAttackModifier(15)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FALL_PROTECTION), 1))
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
                                .slashArtsType(LBslashArtRegsitry.HungerAbsorption.getId())
                                .baseAttackModifier(16)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.BANE_OF_ARTHROPODS), 1))
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
                                .baseAttackModifier(15)
                                .slashArtsType(LBslashArtRegsitry.soullock.getId())
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 4),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.BLOCK_EFFICIENCY), 2))
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
                                .slashArtsType(LBslashArtRegsitry.flurry.getId())
                                .baseAttackModifier(15)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.THORNS), 2))
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
                                .slashArtsType(LBslashArtRegsitry.Thatcher.getId())
                                .baseAttackModifier(16)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 2),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 5),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 1),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.KNOCKBACK), 2))
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
                                .slashArtsType(LBslashArtRegsitry.GreedyGrip.getId())
                                .baseAttackModifier(16)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 2),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 2),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.MOB_LOOTING), 2),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.BLOCK_FORTUNE), 1),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.PUNCH_ARROWS), 1)))
                );
        bootstrap.register(
                samael, new SlashBladeDefinition(Legendblade.prefix("samael"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/named/samael/samael.png"))
                                .modelName(Legendblade.prefix("model/named/samael/samael.obj"))
                                .effectColor(16711697)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .slashArtsType(LBslashArtRegsitry.Splitapart.getId())
                                .baseAttackModifier(18)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 1),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 2),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 2),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_ASPECT), 1)
                        )
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
                                .slashArtsType(LBslashArtRegsitry.PhantomThrust.getId())
                                .addSpecialEffect(LBSpecialEffectsRegistry.poison.getId())
                                .addSpecialEffect(LBSpecialEffectsRegistry.Sin.getId())
                                .baseAttackModifier(21)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 7),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 7),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FALL_PROTECTION), 3)
                        )
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
                                .slashArtsType(LBslashArtRegsitry.HungerAbsorption.getId())
                                .addSpecialEffect(LBSpecialEffectsRegistry.Sin.getId())
                                .addSpecialEffect(LBSpecialEffectsRegistry.Feastful.getId())
                                .baseAttackModifier(20)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 7),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.BANE_OF_ARTHROPODS), 5)
                        )
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
                                .slashArtsType(LBslashArtRegsitry.soullock.getId())
                                .addSpecialEffect(LBSpecialEffectsRegistry.Shackles.getId())
                                .addSpecialEffect(LBSpecialEffectsRegistry.Sin.getId())
                                .baseAttackModifier(16)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 7),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 7),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.BLOCK_EFFICIENCY), 3)
                        )
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
                                .slashArtsType(SlashArtsRegistry.DRIVE_VERTICAL.getId())
                                .addSpecialEffect(LBSpecialEffectsRegistry.Sin.getId())
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
                                .slashArtsType(LBslashArtRegsitry.flurry.getId())
                                .addSpecialEffect(LBSpecialEffectsRegistry.Sin.getId())
                                .addSpecialEffect(LBSpecialEffectsRegistry.Resentment.getId())
                                .baseAttackModifier(19)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 5),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 5),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.THORNS), 7)
                        )
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
                                .addSpecialEffect(LBSpecialEffectsRegistry.Sin.getId())
                                .addSpecialEffect(LBSpecialEffectsRegistry.Suppress.getId())
                                .slashArtsType(LBslashArtRegsitry.Thatcher.getId())
                                .baseAttackModifier(18)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 6),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 7),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.KNOCKBACK), 7)
                        )
                ));
        bootstrap.register(
                mammonex, new SlashBladeDefinition(Legendblade.prefix("mammonex"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/bladeex/mammonex/mammonex.png"))
                                .modelName(Legendblade.prefix("model/bladeex/mammonex/mammonex.obj"))
                                .effectColor(16737792)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .slashArtsType(LBslashArtRegsitry.GreedyGrip.getId())
                                .addSpecialEffect(LBSpecialEffectsRegistry.Sin.getId())
                                .addSpecialEffect(LBSpecialEffectsRegistry.Endless.getId())
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(20)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.PUNCH_ARROWS), 5),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 7),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.MENDING), 7),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.MOB_LOOTING), 7)
                        )
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
                                .slashArtsType(LBslashArtRegsitry.Splitapart.getId())
                                .addSpecialEffect(LBSpecialEffectsRegistry.Sin.getId())
                                .addSpecialEffect(LBSpecialEffectsRegistry.Bloodthirsty.getId())
                                .baseAttackModifier(25)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 6),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 6),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 7),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_ASPECT), 7)
                        )
                ));
        bootstrap.register(
                foxex, new SlashBladeDefinition(Legendblade.prefix("foxex"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/foxex/texture.png"))
                                .modelName(Legendblade.prefix("model/foxex/model.obj"))
                                .effectColor(16187647)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .addSpecialEffect(LBSpecialEffectsRegistry.FoxBlessing.getId())
                                .slashArtsType(LBslashArtRegsitry.VoidSlashPlus.getId())
                                .baseAttackModifier(22)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.BANE_OF_ARTHROPODS), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 7),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_ASPECT), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 3)
                        )
                ));
        bootstrap.register(
                foxex2, new SlashBladeDefinition(Legendblade.prefix("foxex2"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/foxex/texture2.png"))
                                .modelName(Legendblade.prefix("model/foxex/model.obj"))
                                .effectColor(2633861)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .addSpecialEffect(LBSpecialEffectsRegistry.FoxBlessing.getId())
                                .slashArtsType(LBslashArtRegsitry.Thrust.getId())
                                .baseAttackModifier(22)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.BANE_OF_ARTHROPODS), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.MOB_LOOTING), 5),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_ASPECT), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 3)
                        )
                ));
        bootstrap.register(
                foxexfinal, new SlashBladeDefinition(Legendblade.prefix("foxexfinal"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/foxex/texture3.png"))
                                .effectColor(16187647)
                                .modelName(Legendblade.prefix("model/foxex/model2.obj"))
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .slashArtsType(LBslashArtRegsitry.SAKURAENDEX.getId())
                                .addSpecialEffect(LBSpecialEffectsRegistry.SummonSword.getId())
                                .addSpecialEffect(LBSpecialEffectsRegistry.FoxBlessing.getId())
                                .baseAttackModifier(30)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 10),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.BANE_OF_ARTHROPODS), 10),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 7),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_ASPECT), 5),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 5)
                        )
                ));
        bootstrap.register(
                wujiu, new SlashBladeDefinition(Legendblade.prefix("wujiu"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/yaoxing/wujiu.png"))
                                .modelName(Legendblade.prefix("model/yaoxing/wujiu.obj"))
                                .effectColor(12434877)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .slashArtsType(LBslashArtRegsitry.swordone.getId())
                                .addSpecialEffect(LBSpecialEffectsRegistry.Liuli.getId())
                                .addSpecialEffect(LBSpecialEffectsRegistry.Liulione.getId())
                                .baseAttackModifier(30)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 5),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER_ARROWS), 10),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.ALL_DAMAGE_PROTECTION), 5),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.THORNS), 5)

                        )
                ));

        bootstrap.register(
                belphebubex, new SlashBladeDefinition(Legendblade.prefix("belphebubex"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/bladeex/beelzebubex/beelzebubexex_export.png"))
                                .modelName(Legendblade.prefix("model/bladeex/beelzebubex/beelzebubex.obj"))
                                .effectColor(65298)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .slashArtsType(LBslashArtRegsitry.HungerAbsorption.getId())
                                .addSpecialEffect(LBSpecialEffectsRegistry.Feastful.getId())
                                .addSpecialEffect(LBSpecialEffectsRegistry.Shackles.getId())
                                .baseAttackModifier(25)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 7),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 7),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.BANE_OF_ARTHROPODS), 5)
                        )
                ));

        bootstrap.register(
                waterex, new SlashBladeDefinition(Legendblade.prefix("waterex"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/kaumyex/water.png"))
                                .modelName(Legendblade.prefix("model/kaumyex/kamuyex.obj"))
                                .effectColor(8703)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .slashArtsType(SBALBSlashArtRegsitry.terrifyingwavesSA.getId())
                                .addSpecialEffect(SBALBSlashArtRegsitry.Terrifyingwaves.getId())
                                .baseAttackModifier(20)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 7),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 7),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.BANE_OF_ARTHROPODS), 5)
                        )
                ));
        bootstrap.register(
                fireex, new SlashBladeDefinition(Legendblade.prefix("fireex"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/kaumyex/fire.png"))
                                .modelName(Legendblade.prefix("model/kaumyex/kamuyex.obj"))
                                .effectColor(16711680)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .slashArtsType(SBALBSlashArtRegsitry.DanceSA.getId())
                                .addSpecialEffect(SBALBSlashArtRegsitry.FireDancy.getId())
                                .baseAttackModifier(20)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 7),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 7),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 5)
                        )
                ));
        bootstrap.register(
                lightningex, new SlashBladeDefinition(Legendblade.prefix("lightningex"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/kaumyex/lightning.png"))
                                .modelName(Legendblade.prefix("model/kaumyex/kamuyex.obj"))
                                .effectColor(16766720)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .slashArtsType(SBALBSlashArtRegsitry.lightingsumSA.getId())
                                .addSpecialEffect(SBALBSlashArtRegsitry.Lightingsum.getId())
                                .baseAttackModifier(20)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 15),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 7)
                        )
                ));
        bootstrap.register(
                sevensword, new SlashBladeDefinition(Legendblade.prefix("sevensword"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(Legendblade.prefix("model/sevensword/texture.png"))
                                .modelName(Legendblade.prefix("model/sevensword/model.obj"))
                                .effectColor(16766720)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .baseAttackModifier(20)
                                .maxDamage(80)
                                .build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 15),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 7)
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
