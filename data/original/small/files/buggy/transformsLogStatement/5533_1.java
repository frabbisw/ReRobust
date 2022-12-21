@org.testng.annotations.Test
public void testCompareCellsDESC() throws com.stratio.crossdata.common.exceptions.UnsupportedException {
    System.out.println("log");
    assertEquals(compareCell(OrderDirection.DESC, true, false), 1);
}
