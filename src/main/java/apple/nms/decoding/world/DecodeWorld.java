package apple.nms.decoding.world;

import net.minecraft.core.BlockPosition;
import net.minecraft.server.level.WorldServer;
import net.minecraft.world.level.chunk.Chunk;
import org.bukkit.World;
import org.bukkit.craftbukkit.v1_17_R1.CraftWorld;

public class DecodeWorld {
    static WorldServer getWorldServer(CraftWorld world) {
        return world.getHandle();
    }

    public static WorldServer getWorldServer(World world) {
        return getWorldServer((CraftWorld) world);
    }

    public static Chunk getChunkAtWorldCoords(double x, double z, World world) {
        BlockPosition pos = new BlockPosition(x, 0, z);
        net.minecraft.world.level.chunk.Chunk chunk = ((CraftWorld) world).getHandle().getChunkAtWorldCoords(pos);
        return chunk;
    }
}
