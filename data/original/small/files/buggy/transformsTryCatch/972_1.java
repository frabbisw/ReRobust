public void setMonthData(sun.bob.simcal.model.mMonthData data) {
    currentCCYY = data.getYear();
    try {
        currentMM = data.getMonth();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    currentDD = data.getCenterDay();
}
