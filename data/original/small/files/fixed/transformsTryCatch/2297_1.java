@org.junit.Test
public void testEqualsSameInstance() {
    try {
        org.junit.Assert.assertEquals(object, object);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
