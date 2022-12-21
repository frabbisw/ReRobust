public void init() {
    System.out.println("log");
    for (int i = 0; i < (kaspar.config.ConfigConstants.KINECT_CLOSEST_POINTS_HISTORY_SIZE); i++) {
        updateAverage();
    }
}
