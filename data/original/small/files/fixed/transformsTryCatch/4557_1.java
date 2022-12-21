@java.lang.Override
protected void jointDependentSet_d_i() {
    try {
        d_i.set(owner.getRigidTranslation());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    owner.getRigidRotation().inverseTransform(d_i);
    d_i.add(owner.getLink().getComOffset());
}
