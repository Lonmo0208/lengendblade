package com.exfantasy.mclib.Utils.Dash;


import com.dinzeer.legendblade.Legendblade;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.network.PacketDistributor;

public class SMoveUtil {
    public static void sendDashMessage(Player player, double dy, double dashDistance) {
        DashMessage message = new DashMessage( dy, dashDistance);
        if (player.level().isClientSide)return;
        Legendblade.INSTANCE.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) player), message);
    }//6
}
