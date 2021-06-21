package apple.nms.decoding.iregistry;

import net.minecraft.core.IRegistry;
import net.minecraft.core.RegistryBlocks;
import net.minecraft.world.entity.EntityTypes;

public class DecodeIRegistry {
    public static RegistryBlocks<EntityTypes<?>> getEntityType() {
        return IRegistry.Y;
    }
}
