private void calculateAverageBPM() {
    if (0 == (inconsistentLastBPM))
        lastBPM = currentBPM;
    inconsistentLastBPM = ((currentBPM) + (inconsistentLastBPM)) / 2;
    publishLastBPM();
}
