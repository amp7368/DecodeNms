package apple.nms.decoding.world;

import net.minecraft.core.IRegistry;
import net.minecraft.core.IRegistryWritable;
import net.minecraft.resources.MinecraftKey;
import net.minecraft.server.level.WorldServer;
import net.minecraft.world.level.biome.BiomeBase;
import net.minecraft.world.level.chunk.BiomeStorage;
import net.minecraft.world.level.chunk.Chunk;
import org.bukkit.World;
import org.bukkit.craftbukkit.v1_17_R1.CraftWorld;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DecodeBiome {
    public static boolean biomeEquals(World world, BiomeBase biome1, BiomeBase biome2) {
        if (biome1 == null || biome2 == null) return false;
        IRegistryWritable<BiomeBase> biomeRegistry = getBiomeRegistry(world);
        int key1 = biomeRegistry.getId(biome1);
        int key2 = biomeRegistry.getId(biome2);
        return key1 == key2;
    }

    @NotNull
    public static IRegistryWritable<BiomeBase> getBiomeRegistry(World world) {
        WorldServer worldNms = DecodeWorld.getWorldServer(world);
        return worldNms.t().a(IRegistry.aO).get();
    }

    public static void setBiomeAt(World world, BiomeBase biome, int x, int y, int z) {
        ((CraftWorld) world).setBiome(x, y, z, biome);
    }

    public static void setBiomeAt(World world, BiomeBase biome, double x, double y, double z) {
        setBiomeAt(world, biome, (int) x, (int) y, (int) z);
    }

    @Nullable
    public static BiomeBase getBiomeAt(World world, int x, int y, int z) {
        Chunk chunk = DecodeWorld.getChunkAtWorldCoords(x, z, world);
        BiomeStorage biomeIndex = chunk.getBiomeIndex();
        if (biomeIndex == null) return null;
        return biomeIndex.getBiome(x >> 2, y >> 2, z >> 2);
    }

    @Nullable
    public static BiomeBase getBiomeAt(World world, double x, double y, double z) {
        return getBiomeAt(world, (int) x, (int) y, (int) z);
    }

    @Nullable
    public static MinecraftKey getBiomeKeyAt(World world, int x, int y, int z) {
        return getBiomeKey(world, getBiomeAt(world, x, y, z));
    }

    @Nullable
    public static MinecraftKey getBiomeKeyAt(World world, double x, double y, double z) {
        return getBiomeKeyAt(world, (int) x, (int) y, (int) z);
    }

    public static MinecraftKey getBiomeKey(World world, BiomeBase biome) {
        if (biome == null) return null;
        return getBiomeRegistry(world).getKey(biome);
    }

    @Nullable
    public static BiomeBase getBiomeFromKey(World world, @Nullable MinecraftKey key) {
        return getBiomeRegistry(world).get(key);
    }
}
