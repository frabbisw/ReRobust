@org.junit.Before
public void createSQLDBObject() {
    try {
        ctx = android.support.test.InstrumentationRegistry.getTargetContext();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mDB1 = new com.example.boba.lookapplication.DB1(ctx, com.example.boba.lookapplication.TestSQLLiteDB.TEST_NAME_DB);
}
