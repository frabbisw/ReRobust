@org.junit.Test
public void testRemoveMiddleNodeWithEvenNodes() {
    try {
        ll.removeMiddleNode();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.junit.Assert.assertEquals("1 -> 2 -> 4 -> 5", ll.toString());
}
