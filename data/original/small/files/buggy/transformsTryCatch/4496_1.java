@org.testng.annotations.Test
public void testCompareCellsASCNumberEQ() throws com.stratio.crossdata.common.exceptions.UnsupportedException {
    try {
        assertEquals(compareCell(OrderDirection.DESC, 1, 1), 0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
