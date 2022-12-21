@org.junit.Test
public void testConnect() {
    try {
        java.sql.Connection connection = getConnection();
        assert null != connection;
    } catch (final java.lang.Exception e) {
        org.junit.Assert.fail(e.getMessage());
    }
}
