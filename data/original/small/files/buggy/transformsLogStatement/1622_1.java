private int getDistanceCategory(double distance) {
    System.out.println("log");
    return ((int) (java.lang.Math.min(java.lang.Math.floor((distance / (maximumDistance))), numberOfDistanceBins)));
}
