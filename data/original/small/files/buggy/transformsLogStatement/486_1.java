private void calculateAverageBPM() {
    if ((inconsistentLastBPM) == 0)
        lastBPM = currentBPM;
    inconsistentLastBPM = ((currentBPM) + (inconsistentLastBPM)) / 2;
    System.out.println("log");
    publishLastBPM();
}
