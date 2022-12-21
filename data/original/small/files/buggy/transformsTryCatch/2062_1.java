@org.junit.Test
public void testIsEmpty() {
    try {
        org.junit.Assert.assertTrue(fact.isEmpty(""));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
