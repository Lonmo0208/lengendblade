package com.dinzeer.legendblade;

import com.dinzeer.legendblade.init.LBModItems;
import com.dinzeer.legendblade.regsitry.*;
import com.dinzeer.legendblade.regsitry.creativetab.ItemTab;
import com.mojang.logging.LogUtils;
import com.tterrag.registrate.Registrate;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
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
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
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




    public Legendblade() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        LangRegsitry.registerAddlang();
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::register);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
         LBEntiteRegristrys.register(modEventBus);
        LBComboRegsitry.COMBO_STATES.register(modEventBus);
        LBSpecialEffectsRegistry.REGISTRY_KEY2.register(modEventBus);
        LBslashArtRegsitry.SLASH_ARTS.register(modEventBus);
        LBModItems.register();
        ItemTab.REGISTRY.register(modEventBus);

    }
    public void register(RegisterEvent event) {
        LBEntiteRegristrys.register(event);
    }
    private void commonSetup(final FMLCommonSetupEvent event) {
       }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
                 }
    }
}
