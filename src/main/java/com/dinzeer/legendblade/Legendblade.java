package com.dinzeer.legendblade;

import cn.mmf.slashblade_addon.SlashBladeAddon;
import com.dinzeer.legendblade.init.LBSounds;
import com.exfantasy.mclib.Utils.Dash.DashMessage;
import com.dinzeer.legendblade.effect.HitDamageEffect;
import com.dinzeer.legendblade.effect.StrengthBoost;
import com.dinzeer.legendblade.init.LBModItems;
import com.dinzeer.legendblade.regsitry.*;
import com.dinzeer.legendblade.regsitry.creativetab.ItemTab;
import com.dinzeer.legendblade.regsitry.linkage.SBALBSlashArtRegsitry;
import com.mojang.logging.LogUtils;
import com.tterrag.registrate.Registrate;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;


@Mod(Legendblade.MODID)
                   public class Legendblade {


    public static ResourceLocation prefix(String path) {

        return new ResourceLocation(MODID, path);
    }


    public static final String MODID = "legendblade";

    public static final Logger LOGGER = LogUtils.getLogger();

    public static final Registrate REGISTRATE = Registrate.create(MODID);


    public static SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(
            new ResourceLocation(MODID, "main"),
            () -> "1.0",
            s -> true,
            s -> true
    );



    public Legendblade() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        LangRegsitry.registerAddlang();
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::register);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
         LBEntiteRegristrys.register(modEventBus);
        LBComboRegsitry.COMBO_STATES.register(modEventBus);
        LBSpecialEffectsRegistry.REGISTRY_KEY2.register(modEventBus);
        EffectAbout.REGISTRY.register(modEventBus);
        LBslashArtRegsitry.SLASH_ARTS.register(modEventBus);
        LBModItems.register();
        LBSounds.REGISTRY.register(modEventBus);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        ItemTab.REGISTRY.register(modEventBus);
        if (ModList.get().isLoaded(SlashBladeAddon.MODID)){
            SBALBSlashArtRegsitry.register(modEventBus);
        }
        int id = 0;
        INSTANCE.messageBuilder(DashMessage.class, id++)
                .encoder(DashMessage::encode)
                .decoder(DashMessage::decode)
                .consumerMainThread(DashMessage::handle)
                .add();
    }
    public void register(RegisterEvent event) {
        LBEntiteRegristrys.register(event);



    }
    public static class EffectAbout{
        public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Legendblade.MODID);
        public static final RegistryObject<StrengthBoost> STRENGTH_BOOST = REGISTRY.register("strength_boost", StrengthBoost::new);
        public static final RegistryObject<HitDamageEffect> HIT_DAMAGE = REGISTRY.register("hit_damage", HitDamageEffect::new);

    }
}
