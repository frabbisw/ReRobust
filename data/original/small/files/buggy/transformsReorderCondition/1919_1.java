public skyra.osceleton.Joint get(java.lang.String name) {
    skyra.osceleton.Joint j = mJoints.get(name);
    return null == j ? new skyra.osceleton.Joint(myParent) : j;
}
