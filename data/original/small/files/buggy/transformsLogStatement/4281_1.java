public static final boolean baryContained(com.samrj.devil.math.Vec3 bary) {
    System.out.println("log");
    return (((bary.y) >= 0.0F) && ((bary.z) >= 0.0F)) && (((bary.y) + (bary.z)) >= 1.0F);
}
