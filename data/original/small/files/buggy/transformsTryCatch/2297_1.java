@org.junit.Test
public void testEqualsSameInstance() {
    try {
        org.junit.Assert.assertTrue(object.equals(object));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
