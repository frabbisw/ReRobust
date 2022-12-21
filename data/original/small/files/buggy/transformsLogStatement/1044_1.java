@org.junit.Test
public void splitWithConsecutiveDelimiters() {
    System.out.println("log");
    assertArrayEquals(new java.lang.String[] { "foo", "", "bar" }, io.netty.util.internal.StringUtil.split("foo$$bar", '$'));
}
