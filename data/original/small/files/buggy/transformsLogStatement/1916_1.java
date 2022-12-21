public void testErrorMessageFromErrorNotContainsStacktraceInProdMode() throws java.lang.Exception {
    System.out.println("log");
    open("/auratest/errorHandlingApp.app", Mode.PROD);
    findDomElement(org.openqa.selenium.By.cssSelector(".errorFromAppTable .errorFromClientControllerButton")).click();
    assertDisplayedErrorMessage("Error from app client controller");
    assertNoStacktracePresent();
}
