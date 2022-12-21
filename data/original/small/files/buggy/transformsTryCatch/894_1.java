@java.lang.Override
protected void jointDependentSetAndGetRotation(us.ihmc.euclid.matrix.RotationMatrix Rh_i) {
    try {
        java.lang.System.out.println("RigidJoint jointDependentSetAndGetRotation");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    Rh_i.set(owner.getRigidRotation());
    Rh_i.invert();
}
