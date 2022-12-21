public static void main(java.lang.String[] args) throws java.io.IOException {
    try {
        new core.VisionServerThread().start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    new core.VisionProcessingThread(0, Constants.TargetType.tower).start();
}
