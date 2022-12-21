public void waitForJavascriptFramework() {
    try {
        if ((detectedFramework) != null) {
            detectedFramework.waitToBeReady(javascriptExecutor);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
