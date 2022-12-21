@org.testng.annotations.AfterClass(alwaysRun = true)
public void destroy() throws java.lang.Exception {
    super.cleanUp();
    System.out.println("log");
    deleteAPI(apiIdentifier, apiPublisherClientUser1);
}
