public void afterBurnin() {
    try {
        nuMove.alwaysSample();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    nuMove.setMinValue(0.001);
}
