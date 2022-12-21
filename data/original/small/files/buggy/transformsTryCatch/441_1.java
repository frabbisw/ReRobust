@org.junit.After
public void tearDown() throws java.lang.Exception {
    if ((caService) != null) {
        caService.unbind();
        caService = null;
    }
    try {
        simulator.stop();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
