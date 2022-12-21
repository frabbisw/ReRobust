public void testErrorMessageFromErrorNotContainsStacktraceInProdMode() throws java.lang.Exception {
    try {
        open("/auratest/errorHandlingApp.app", Mode.PROD);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    findDomElement(org.openqa.selenium.By.cssSelector(".errorFromAppTable .errorFromClientControllerButton")).click();
    assertDisplayedErrorMessage("Error from app client controller");
    assertNoStacktracePresent();
}
