@org.junit.Test
public void testEqualsAttributeJointInverse() {
    datastructures.AttributeJoint a = new datastructures.AttributeJoint();
    try {
        assertFalse(mainAttributeJoint.equals(a));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
