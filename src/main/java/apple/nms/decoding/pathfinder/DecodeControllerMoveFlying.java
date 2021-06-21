package apple.nms.decoding.pathfinder;

import net.minecraft.world.entity.EntityInsentient;
import net.minecraft.world.entity.ai.control.ControllerMoveFlying;

public class DecodeControllerMoveFlying extends ControllerMoveFlying {
    public DecodeControllerMoveFlying(EntityInsentient var0, int var1, boolean var2) {
        super(var0, var1, var2);
    }
    protected EntityInsentient me(){
        return this.d;
    }
    protected double x() {
        return this.e;
    }

    protected double y() {
        return this.f;
    }

    protected double z() {
        return this.g;
    }

    public enum DecodeOperation {
        WAIT(Operation.a),
        MOVE_TO(Operation.b),
        STRAFE(Operation.c),
        JUMPING(Operation.d);

        private final Operation encoded;

        DecodeOperation(Operation encoded) {
            this.encoded = encoded;
        }

        public Operation encode() {
            return encoded;
        }
    }
}
