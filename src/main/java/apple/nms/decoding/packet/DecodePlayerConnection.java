package apple.nms.decoding.packet;

import io.netty.channel.Channel;
import net.minecraft.network.NetworkManager;
import net.minecraft.server.level.EntityPlayer;
import net.minecraft.server.network.PlayerConnection;

public class DecodePlayerConnection {
    public static PlayerConnection getPlayerConnection(EntityPlayer player) {
        return player.b;
    }

    public static NetworkManager getNetworkManager(PlayerConnection connection) {
        return connection.a;
    }

    public static NetworkManager getNetworkManager(EntityPlayer player) {
        return getNetworkManager(getPlayerConnection(player));
    }

    public static Channel getChannel(NetworkManager networkManager) {
        return networkManager.k;
    }

    public static Channel getChannel(PlayerConnection connection) {
        return getChannel(getNetworkManager(connection));
    }

    public static Channel getChannel(EntityPlayer player) {
        return getChannel(getPlayerConnection(player));
    }
}
