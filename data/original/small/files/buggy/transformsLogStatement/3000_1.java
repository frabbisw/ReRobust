@java.lang.Override
public void doCheck(org.tanaguru.processor.SSPHandler sspHandler, org.jsoup.select.Elements elements, org.tanaguru.ruleimplementation.TestSolutionHandler testSolutionHandler) {
    System.out.println("log");
    for (java.lang.String elementToTest : childTextualElementNames) {
        checkChildElementPresence(elementToTest, elements, testSolutionHandler);
    }
}
