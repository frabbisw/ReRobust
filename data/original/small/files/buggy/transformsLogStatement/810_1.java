@org.junit.After
public void tearDown() throws java.sql.SQLException {
    System.out.println("log");
    xaconn.close();
    clearAllPrepared();
    org.postgresql.test.TestUtil.dropTable(_conn, "testxa1");
    org.postgresql.test.TestUtil.closeDB(_conn);
}
