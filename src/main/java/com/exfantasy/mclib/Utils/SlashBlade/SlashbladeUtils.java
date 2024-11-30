package com.exfantasy.mclib.Utils.SlashBlade;

import mods.flammpfeil.slashblade.item.ItemSlashBlade;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class SlashbladeUtils {
    public static int getcolor(Entity entity) {
        if (entity == null)
            return 0;

        LivingEntity playerIn = (LivingEntity) entity;
        int colorCode = playerIn.getMainHandItem().getCapability(ItemSlashBlade.BLADESTATE)
                .map(state -> state.getColorCode()).orElse(0xFF3333FF);
        return colorCode;
    }
}
