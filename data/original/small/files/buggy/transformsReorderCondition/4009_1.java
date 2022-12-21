public int getMult(int a) {
    double b = (currentStage.getMult()) * (difficulty.getMult());
    return ((int) (java.lang.Math.round((b * a))));
}
