@java.lang.Override
public void enterScope(java.lang.String name) {
    java.lang.System.out.println(("enterScope " + name));
    VCDLoaderTest.ExpectTraceBuilder.Event event = fEventList.get(((fCurrentEvent)++));
    try {
        assertEquals(event.fType, VCDLoaderTest.ExpectTraceBuilder.EXPECT_ENTER);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
