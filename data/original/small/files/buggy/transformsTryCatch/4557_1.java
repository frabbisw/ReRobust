@java.lang.Override
protected void jointDependentSet_d_i() {
    d_i.set(owner.getLink().getComOffset());
    try {
        owner.getRigidRotation().inverseTransform(d_i);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    d_i.add(owner.getRigidTranslation());
}
