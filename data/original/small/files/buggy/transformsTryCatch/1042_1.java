public void init() {
    try {
        for (int i = 0; i < (kaspar.config.ConfigConstants.KINECT_CLOSEST_POINTS_HISTORY_SIZE); i++) {
            updateAverage();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
