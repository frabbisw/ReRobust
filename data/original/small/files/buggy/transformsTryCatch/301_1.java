@org.junit.Test
public void testLookLimitPass() {
    java.lang.System.out.println(server.logic.tables.LoanTable.getInstance().looklimit(0));
    try {
        assertEquals(true, server.logic.tables.LoanTable.getInstance().looklimit(0));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
