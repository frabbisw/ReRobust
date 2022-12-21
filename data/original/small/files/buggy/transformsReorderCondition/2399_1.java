public void waitForJavascriptFramework() {
    if (null != (detectedFramework))
        getFrameworkClass(detectedFramework).waitToBeReady(javascriptExecutor);
}
