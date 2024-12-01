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
    public static boolean hasSpecialEffect(ItemStack stack, String effect) {
        CompoundTag tag = stack.getOrCreateTag(); // 获取或创建NBT标签

        if (tag.contains("bladeState")) { // 检查是否存在ForgeCaps标签
            CompoundTag forgeCaps = tag.getCompound("bladeState");

            if (forgeCaps.contains("SpecialEffects")) { // 检查SpecialEffects标签
                ListTag specialEffects = forgeCaps.getList("SpecialEffects",8); // 8表示String类型
                for (int i = 0; i < specialEffects.size(); i++) {
                    String currentEffect = specialEffects.getString(i);
                    if (effect.equals(currentEffect)) {
                        return true; // 找到了指定的特殊效果
                    }
                }

            }

        }
        return false; // 没有找到指定的特殊效果
    }
    public static int getNumberNBT(CompoundTag tag , String key){

        if (tag.contains("bladeState")) { // 检查是否存在ForgeCaps标签
            CompoundTag forgeCaps = tag.getCompound("bladeState");

            return forgeCaps.getInt(key);


            }
        return 0;

        }
    public static String getStringNBT(CompoundTag tag , String key){

        if (tag.contains("bladeState")) { // 检查是否存在ForgeCaps标签
            CompoundTag forgeCaps = tag.getCompound("bladeState");

            return forgeCaps.getString(key);


        }
        return "";

    }
}
