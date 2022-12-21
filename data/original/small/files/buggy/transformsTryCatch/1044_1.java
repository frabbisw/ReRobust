@org.junit.Test
public void splitWithConsecutiveDelimiters() {
    try {
        assertArrayEquals(new java.lang.String[] { "foo", "", "bar" }, io.netty.util.internal.StringUtil.split("foo$$bar", '$'));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
