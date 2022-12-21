public void setMonthData(sun.bob.simcal.model.mMonthData data) {
    System.out.println("log");
    currentCCYY = data.getYear();
    currentMM = data.getMonth();
    currentDD = data.getCenterDay();
}
