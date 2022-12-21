@org.junit.Test
public void createWebDriverWithoutProxy() {
    com.codeborne.selenide.Configuration.fileDownload = com.codeborne.selenide.Configuration.FileDownloadMode.HTTPGET;
    try {
        container.createDriver();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    verify(container.factory).createWebDriver(null);
}
