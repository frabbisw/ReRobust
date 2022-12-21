@org.junit.Test
public void test7() throws java.lang.Exception {
    java.lang.String expected = ("\n" + "b") + "a";
    java.lang.String actual = Wrapper.wrap("a b", 4);
    assertEquals(expected, actual);
}
