package com.dinzeer.legendblade.regsitry;

import com.dinzeer.legendblade.entity.DriveSummonEntity;
import com.dinzeer.legendblade.entity.SumonSwordEntity;
import com.google.common.base.CaseFormat;
import mods.flammpfeil.slashblade.init.SBItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

import static com.dinzeer.legendblade.Legendblade.MODID;

public class LBEntiteRegristrys {
    private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MODID);
    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }

    public static final ResourceLocation SSLOC = new ResourceLocation(MODID, classToString(SumonSwordEntity.class));
    public static EntityType<SumonSwordEntity> ss;
    public static final ResourceLocation SDLOC = new ResourceLocation(MODID, classToString(DriveSummonEntity.class));
    public static EntityType<DriveSummonEntity> sd;

    public static void register(RegisterEvent event){

        event.register(ForgeRegistries.Keys.ENTITY_TYPES, helper -> {
            {
                EntityType<SumonSwordEntity> entity = ss = EntityType.Builder
                        .of(SumonSwordEntity::new, MobCategory.MISC)
                        .sized(0.9F, 0.9F)
                        .setTrackingRange(4)
                        .setUpdateInterval(20).setCustomClientFactory(SumonSwordEntity::createInstance)
                        .build(SSLOC.toString());
                helper.register(SSLOC, entity);
            }

        });
        event.register(ForgeRegistries.Keys.ENTITY_TYPES, helper -> {
            {
                EntityType<DriveSummonEntity> entity = sd = EntityType.Builder
                        .of(DriveSummonEntity::new, MobCategory.MISC)
                        .sized(0.9F, 0.9F)
                        .setTrackingRange(4)
                        .setUpdateInterval(20).setCustomClientFactory(DriveSummonEntity::createInstance)
                        .build(SDLOC.toString());
                helper.register(SDLOC, entity);
            }

        });
    }


    public static String classToString(Class<? extends Entity> entityClass)
    {
        return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, entityClass.getSimpleName())
                .replace("entity_", "");
    }






}










