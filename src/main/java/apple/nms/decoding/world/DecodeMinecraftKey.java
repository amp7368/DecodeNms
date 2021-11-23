package apple.nms.decoding.world;

import net.minecraft.ResourceKeyInvalidException;
import net.minecraft.resources.MinecraftKey;
import org.jetbrains.annotations.Nullable;

public class DecodeMinecraftKey {
    @Nullable
    public static MinecraftKey makeKey(String key) {
        try {
            return new MinecraftKey(key);
        } catch (ResourceKeyInvalidException e) {
            return null;
        }
    }

    @Nullable
    public static MinecraftKey makeKey(String namespace, String key) {
        try {
            return new MinecraftKey(namespace, key);
        } catch (ResourceKeyInvalidException e) {
            return null;
        }
    }
}
