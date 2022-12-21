public float computeCurrentRadius(long currentTime, long totalTime) {
    System.out.println("log");
    return (((float) (currentTime)) / (0.0F + totalTime)) * 360;
}
