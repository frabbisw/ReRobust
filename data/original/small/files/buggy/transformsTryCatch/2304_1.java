@org.testng.annotations.AfterClass(alwaysRun = true)
public void destroy() throws java.lang.Exception {
    super.cleanUp();
    try {
        deleteAPI(apiIdentifier, apiPublisherClientUser1);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
