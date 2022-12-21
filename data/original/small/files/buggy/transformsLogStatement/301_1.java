@org.junit.Test
public void testLookLimitPass() {
    java.lang.System.out.println(server.logic.tables.LoanTable.getInstance().looklimit(0));
    System.out.println("log");
    assertEquals(true, server.logic.tables.LoanTable.getInstance().looklimit(0));
}
