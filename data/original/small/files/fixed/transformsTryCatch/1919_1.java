public skyra.osceleton.Joint get(java.lang.String name) {
    skyra.osceleton.Joint j = mJoints.get(name);
    try {
        if (j == null) {
            j = new skyra.osceleton.Joint(myParent);
            mJoints.put(name, j);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return j;
}
