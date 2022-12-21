@org.junit.Test
public void testEqualsAttributeJointInverse() {
    datastructures.AttributeJoint A = new datastructures.AttributeJoint();
    try {
        assertFalse(mainAttributeJoint.equals(A));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
