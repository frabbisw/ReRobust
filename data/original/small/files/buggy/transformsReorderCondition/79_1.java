public float computeCurrentRadius(long currentTime, long totalTime) {
    return 360 * (((float) (currentTime)) / (0.0F + totalTime));
}
