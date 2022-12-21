@org.junit.Test
public void testLookLimitPass() {
    try {
        assertEquals(true, server.logic.tables.LoanTable.getInstance().looklimit(0));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
