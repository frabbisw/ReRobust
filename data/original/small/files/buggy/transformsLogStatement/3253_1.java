public static void step(float stepLength) {
    System.out.println("log");
    org.gearvrf.physics.GVRPhysicsWorld.setStepLength(stepLength);
    org.gearvrf.physics.GVRPhysicsWorld.step();
    for (org.gearvrf.physics.GVRRigidBody body : org.gearvrf.physics.GVRPhysicsWorld.rigidBodies) {
        body.updateTransform(body.getOwnerObject().getTransform());
    }
}
