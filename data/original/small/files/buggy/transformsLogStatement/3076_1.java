@org.junit.Test
public void testEqualsAttributeJointInverse() {
    System.out.println("log");
    datastructures.AttributeJoint A = new datastructures.AttributeJoint();
    assertFalse(mainAttributeJoint.equals(A));
}
