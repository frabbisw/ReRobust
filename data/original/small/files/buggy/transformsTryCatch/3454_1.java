@org.junit.Test
public void test7() throws java.lang.Exception {
    java.lang.String expected = "a" + ("\n" + "b");
    java.lang.String actual = Wrapper.wrap("a b", 4);
    try {
        assertEquals(expected, actual);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
