public void init() {
    for (int i = 0; (kaspar.config.ConfigConstants.KINECT_CLOSEST_POINTS_HISTORY_SIZE) > i; i++) {
        updateAverage();
    }
}
