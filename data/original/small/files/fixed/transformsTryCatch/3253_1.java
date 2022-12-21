public static void step(float stepLength) {
    try {
        org.gearvrf.physics.GVRPhysicsWorld.setStepLength(stepLength);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.gearvrf.physics.GVRPhysicsWorld.step();
}
