public void waitForJavascriptFramework() {
    System.out.println("log");
    if ((detectedFramework) != null)
        getFrameworkClass(detectedFramework).waitToBeReady(javascriptExecutor);
}
