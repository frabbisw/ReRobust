@org.testng.annotations.Test
public void testCompareCellsDESC() throws com.stratio.crossdata.common.exceptions.UnsupportedException {
    try {
        assertEquals(compareCell(OrderDirection.DESC, true, false), 1);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
