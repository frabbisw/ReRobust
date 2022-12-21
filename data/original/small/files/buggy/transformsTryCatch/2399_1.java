public void waitForJavascriptFramework() {
    try {
        if ((detectedFramework) != null)
            getFrameworkClass(detectedFramework).waitToBeReady(javascriptExecutor);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
