package com.dinzeer.legendblade.client;

import com.dinzeer.legendblade.regsitry.LBEntiteRegristrys;
import mods.flammpfeil.slashblade.client.renderer.entity.DriveRenderer;
import mods.flammpfeil.slashblade.client.renderer.entity.SummonedSwordRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.dinzeer.legendblade.Legendblade.MODID;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT,modid = MODID)
public class LegendbladeClient {
    @SubscribeEvent
    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(LBEntiteRegristrys.ss, SummonedSwordRenderer::new);
        event.registerEntityRenderer(LBEntiteRegristrys.sd, DriveRenderer::new);
        event.registerEntityRenderer(LBEntiteRegristrys.ssex, SummonedSwordRenderer::new);
        event.registerEntityRenderer(LBEntiteRegristrys.ssdo, DriveRenderer::new);
    }
}
