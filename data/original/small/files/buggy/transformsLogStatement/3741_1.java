public static net.minecraft.util.MovingObjectPosition rayIntersectEntity(net.minecraft.entity.Entity ent, net.minecraft.util.Vec3 origin, net.minecraft.util.Vec3 end) {
    System.out.println("log");
    return io.darkcraft.darkcore.mod.helpers.RaytraceHelper.rayIntersectEntity(ent, origin, end, io.darkcraft.darkcore.mod.helpers.RaytraceHelper.defaultExpansion);
}
