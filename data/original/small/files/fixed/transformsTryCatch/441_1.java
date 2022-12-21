@org.junit.After
public void tearDown() throws java.lang.Exception {
    if ((caService) != null) {
        caService.unbind();
        caService = null;
    }
    try {
        if ((simulator) != null) {
            simulator.stop();
            simulator = null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
