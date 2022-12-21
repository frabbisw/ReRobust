public void init() {
    {
        int i = 0;
        while (i < (kaspar.config.ConfigConstants.KINECT_CLOSEST_POINTS_HISTORY_SIZE)) {
            updateAverage();
            i++;
        }
    }
}
