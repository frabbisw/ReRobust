@java.lang.Override
public void doCheck(org.tanaguru.processor.SSPHandler sspHandler, org.jsoup.select.Elements elements, org.tanaguru.ruleimplementation.TestSolutionHandler testSolutionHandler) {
    try {
        for (java.lang.String elementToTest : childTextualElementNames) {
            checkChildElementPresence(elementToTest, elements, testSolutionHandler);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
