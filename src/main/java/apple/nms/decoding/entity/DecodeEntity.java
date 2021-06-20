package apple.nms.decoding.entity;

import net.minecraft.world.entity.Entity;

public class DecodeEntity {
    public static void setNoDamageTicks(Entity entity, int newNoDamageTicks) {
        entity.W = newNoDamageTicks;
    }
}
