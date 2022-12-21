private void launch() {
    sml.TranslatorTest t = new sml.TranslatorTest();
    try {
        java.lang.System.out.println(t.getInstruction("div"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
