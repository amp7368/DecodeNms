package apple.nms.decoding.entity;

import net.minecraft.world.entity.EnumMainHand;
import net.minecraft.world.entity.EnumMonsterType;

public enum DecodeEnumMainHand {
    LEFT(EnumMainHand.a),
    RIGHT(EnumMainHand.b);
    private final EnumMainHand encoded;

    DecodeEnumMainHand(EnumMainHand encoded) {
        this.encoded = encoded;
    }

    public EnumMainHand encode() {
        return encoded;
    }
}