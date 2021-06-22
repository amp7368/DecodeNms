package apple.nms.decoding.entity;

import net.minecraft.world.entity.EnumMonsterType;

public enum DecodeEnumMonsterType {
    UNDEFINED(EnumMonsterType.a),
    UNDEAD(EnumMonsterType.b),
    ARTHROPOD(EnumMonsterType.c),
    ILLAGER(EnumMonsterType.d),
    WATER_MOB(EnumMonsterType.e);
    private final EnumMonsterType encoded;

    DecodeEnumMonsterType(EnumMonsterType encoded) {
        this.encoded = encoded;
    }

    public EnumMonsterType encode() {
        return encoded;
    }
}