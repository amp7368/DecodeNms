package apple.nms.decoding.entity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityInsentient;
import net.minecraft.world.entity.EntityLiving;
import net.minecraft.world.entity.ai.control.ControllerLook;
import net.minecraft.world.entity.ai.goal.PathfinderGoalSelector;

public class DecodeEntity {
    public static void setNoDamageTicks(Entity entity, int newNoDamageTicks) {
        entity.W = newNoDamageTicks;
    }

    public static int getNoDamageTicks(Entity entity, int newNoDamageTicks) {
        return entity.W;
    }

    public static PathfinderGoalSelector getGoalSelector(EntityInsentient entity) {
        return entity.bO;
    }

    public static PathfinderGoalSelector getTargetSelector(EntityInsentient entity) {
        return entity.bP;
    }

    public static void setGoalSelector(EntityInsentient entity, PathfinderGoalSelector newGoalSelector) {
        entity.bO = newGoalSelector;
    }

    public static void setTargetSelector(EntityInsentient entity, PathfinderGoalSelector newTargetSelector) {
        entity.bP = newTargetSelector;
    }

    public static int getTicksLived(EntityLiving entity) {
        return entity.R;
    }

    public static void setTicksLived(EntityLiving entity, int newTicksLived) {
        entity.R = newTicksLived;
    }

    public static int getHurtTimestamp(EntityLiving entity) {
        return entity.bX;
    }

    public static void setHurtTimestamp(EntityLiving entity, int newhurtTimestamp) {
        entity.bX = newhurtTimestamp;
    }

    public static boolean do_d(Entity entity, NBTTagCompound nbt) {
        return entity.d(nbt);
    }

    public static void setXMove(EntityInsentient entity, float x) {
        entity.u(x);
    }

    public static void setYMove(EntityInsentient entity, float y) {
        entity.v(y);
    }

    public static void setZMove(EntityInsentient entity, float z) {
        entity.w(z);
    }
}
