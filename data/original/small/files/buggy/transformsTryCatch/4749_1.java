@org.junit.Test
public void testRemoveMiddleNodeWithEvenNodes() {
    int num = 5;
    try {
        while (num > 0) {
            ll.add(num);
            --num;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    ll.removeMiddleNode();
    org.junit.Assert.assertEquals("1 -> 2 -> 4 -> 5", ll.toString());
}
