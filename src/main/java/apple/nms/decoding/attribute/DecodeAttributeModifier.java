package apple.nms.decoding.attribute;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;

public class DecodeAttributeModifier {
    public enum Operation {
        ADDITION(AttributeModifier.Operation.a),
        MULTIPLY_BASE(AttributeModifier.Operation.b),
        MULTIPLY_TOTAL(AttributeModifier.Operation.c);

        private final AttributeModifier.Operation encoded;

        Operation(AttributeModifier.Operation encoded) {
            this.encoded = encoded;
        }

        public AttributeModifier.Operation encode() {
            return encoded;
        }
    }
}
