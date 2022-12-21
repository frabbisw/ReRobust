@org.junit.After
public void tearDown() throws java.lang.Exception {
    if (null != (caService)) {
        caService.unbind();
        caService = null;
    }
    simulator.stop();
}
