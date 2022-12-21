@org.junit.After
public void tearDown() throws java.lang.Exception {
    try {
        httpServer.stop();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    httpServer.destroy();
}
