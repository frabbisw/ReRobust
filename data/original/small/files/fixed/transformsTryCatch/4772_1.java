@org.junit.Test
public void testEmptyComoodityFilter() throws java.lang.Exception {
    org.auscope.portal.mineraloccurrence.MineralTenementFilter filter = new org.auscope.portal.mineraloccurrence.MineralTenementFilter("", "", "", "", "", "");
    java.lang.String result = filter.getFilterStringAllRecords();
    try {
        org.junit.Assert.assertTrue(result.isEmpty());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
