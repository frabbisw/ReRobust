private static void stopServer() throws java.lang.Exception {
    try {
        samples.util.SampleAxis2ServerManager.getInstance().stop();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
