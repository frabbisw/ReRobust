@java.lang.Override
protected void setUp() throws java.lang.Exception {
    try {
        super.setUp();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.intellij.codeInsight.CodeInsightSettings _instance = com.intellij.codeInsight.CodeInsightSettings.getInstance();
    _instance.AUTOCOMPLETE_ON_CODE_COMPLETION = false;
}
