package com.exfantasy.mclib.Utils.local;

import net.minecraft.network.chat.Component;

public class ItemtipUtil {
    public static Component Tooltiplocal(String modid,String id){
        return   Component.literal(Component.translatable("Tooltip."+modid+"."+id).getString());
    }




}
