@org.junit.Test
public void testEmptyComoodityFilter() throws java.lang.Exception {
    org.auscope.portal.mineraloccurrence.MineralTenementFilter filter = new org.auscope.portal.mineraloccurrence.MineralTenementFilter("", "", "", "", "");
    java.lang.String result = filter.getFilterStringAllRecords();
    System.out.println("log");
    org.junit.Assert.assertTrue(result.isEmpty());
}
