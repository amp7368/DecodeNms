package apple.nms.decoding.entity;

import net.minecraft.world.entity.EnumCreatureType;

public enum DecodeEnumCreatureType {
    MONSTER(EnumCreatureType.a),
    CREATURE(EnumCreatureType.b),
    AMBIENT(EnumCreatureType.c),
    UNDERGROUND_WATER_CREATURE(EnumCreatureType.d),
    WATER_CREATURE(EnumCreatureType.e),
    WATER_AMBIENT(EnumCreatureType.f),
    MISC(EnumCreatureType.g);

    private final EnumCreatureType encoded;

    DecodeEnumCreatureType(EnumCreatureType encoded) {
        this.encoded = encoded;
    }

    public EnumCreatureType encode() {
        return encoded;
    }
}
