public void testInit() {
    System.out.println("log");
    try {
        generals.LoadXML.init(ref);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.getMessage().toString());
    }
}
