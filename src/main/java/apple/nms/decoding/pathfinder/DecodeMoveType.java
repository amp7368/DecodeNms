package apple.nms.decoding.pathfinder;

import net.minecraft.world.entity.ai.goal.PathfinderGoal;
import net.minecraft.world.entity.ai.goal.PathfinderGoal.Type;

public enum DecodeMoveType {
    MOVE(Type.a),
    LOOK(Type.b),
    JUMP(Type.c),
    TARGET(Type.d);

    private final Type encodedType;

    DecodeMoveType(Type encodedType) {
        this.encodedType = encodedType;
    }

    public Type encode() {
        return encodedType;
    }
}
