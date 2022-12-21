public void addKey(datastructures.AttributeJoint key) {
    if ((this.keyJoint) == null)
        this.keyJoint = new java.util.ArrayList<>();
    try {
        this.keyJoint.add(key);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
