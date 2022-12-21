public com.teamdev.jxbrowser.chromium.Browser getJxBrowser(java.lang.String aContext) {
    com.teamdev.jxbrowser.chromium.BrowserContext lBrowserContext = new com.teamdev.jxbrowser.chromium.BrowserContext(new com.teamdev.jxbrowser.chromium.BrowserContextParams((aContext + ".\\cache\\")));
    return new com.teamdev.jxbrowser.chromium.Browser(lBrowserContext);
}
