@org.junit.After
public void tearDown() throws java.sql.SQLException {
    xaconn.close();
    clearAllPrepared();
    org.postgresql.test.TestUtil.dropTable(_conn, "testxa1");
    try {
        org.postgresql.test.TestUtil.closeDB(_conn);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
