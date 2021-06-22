package apple.nms.decoding.entity;

import net.minecraft.core.Vector3f;
import net.minecraft.world.entity.decoration.EntityArmorStand;

public class DecodeEntityArmorStand {
    public static Vector3f getHeadPose(EntityArmorStand armorStand) {
        return armorStand.v();
    }
}
