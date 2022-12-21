public void addKey(datastructures.AttributeJoint key) {
    if ((this.keys) == null)
        this.keys = new java.util.ArrayList<>();
    try {
        this.keys.add(key);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
