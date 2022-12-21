@org.junit.Test
public void testIsEmpty() {
    try {
        assertTrue(fact.isEmpty(""));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
