public void testOOM_508254() throws java.lang.Exception {
    org.eclipse.cdt.core.parser.tests.ast2.BindingAssertionHelper helper = getAssertionHelper();
    try {
        helper.findName("waldo").resolveBinding();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
