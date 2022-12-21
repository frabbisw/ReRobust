@java.lang.Override
public void enterScope(java.lang.String name) {
    try {
        java.lang.System.out.println(("enterScope " + name));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    VCDLoaderTest.ExpectTraceBuilder.Event event = fEventList.elementAt(((fCurrentEvent)++));
    assertEquals(event.fType, VCDLoaderTest.ExpectTraceBuilder.EXPECT_ENTER);
}
