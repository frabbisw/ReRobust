@java.lang.Override
public void init() throws java.lang.Exception {
    address.MainApp.logger.info("Initializing app ...");
    super.init();
    initComponents();
    initConfig();
    try {
        initPrefs();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    address.browser.BrowserManager.initializeBrowser();
}
