public void afterBurnin() {
    try {
        if ((nuMove) != null) {
            nuMove.alwaysSample();
            nuMove.setMinValue(0.001);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
