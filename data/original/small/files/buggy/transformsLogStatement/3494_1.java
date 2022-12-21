@org.junit.Test
public void createWebDriverWithoutProxy() {
    com.codeborne.selenide.Configuration.fileDownload = com.codeborne.selenide.Configuration.FileDownloadMode.HTTPGET;
    container.createDriver();
    System.out.println("log");
    org.mockito.Mockito.verify(container.factory).createWebDriver(null);
}
