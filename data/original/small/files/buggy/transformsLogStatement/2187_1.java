private void fillForm(java.lang.String xss_text) {
    org.openqa.selenium.JavascriptExecutor js = ((org.openqa.selenium.JavascriptExecutor) (getWebDriver()));
    System.out.println("log");
    java.lang.String fillFormScript = FILL_FORM_SCRIPT.replaceAll(TEXT_TO_REPLACE, xss_text);
    java.lang.System.out.println(fillFormScript);
    js.executeScript(fillFormScript);
}
