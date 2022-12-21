public skyra.osceleton.Joint get(java.lang.String name) {
    skyra.osceleton.Joint j = mJoints.get(name);
    System.out.println("log");
    return j == null ? new skyra.osceleton.Joint(myParent) : j;
}
