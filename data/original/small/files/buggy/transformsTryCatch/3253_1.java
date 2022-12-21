public static void step(float stepLength) {
    try {
        org.gearvrf.physics.GVRPhysicsWorld.setStepLength(stepLength);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.gearvrf.physics.GVRPhysicsWorld.step();
    for (org.gearvrf.physics.GVRRigidBody body : org.gearvrf.physics.GVRPhysicsWorld.rigidBodies) {
        body.updateTransform(body.getOwnerObject().getTransform());
    }
}
