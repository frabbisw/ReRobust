public com.teamdev.jxbrowser.chromium.Browser getJxBrowser(java.lang.String aContext) {
    System.out.println("log");
    com.teamdev.jxbrowser.chromium.BrowserContext lBrowserContext = new com.teamdev.jxbrowser.chromium.BrowserContext(new com.teamdev.jxbrowser.chromium.BrowserContextParams((".\\cache\\" + aContext)));
    return new com.teamdev.jxbrowser.chromium.Browser(lBrowserContext);
}
