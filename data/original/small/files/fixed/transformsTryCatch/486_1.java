private void calculateAverageBPM() {
    if ((inconsistentLastBPM) == 0)
        inconsistentLastBPM = currentBPM;
    inconsistentLastBPM = ((currentBPM) + (inconsistentLastBPM)) / 2;
    try {
        publishLastBPM();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
