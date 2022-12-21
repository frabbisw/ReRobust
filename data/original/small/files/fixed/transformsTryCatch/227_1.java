public void recordCurrentTimeLap() {
    java.lang.String currentTimeStr = getFormattedCurrentTime();
    try {
        recordedLaps.add(((("Lap " + ((recordedLaps.size()) + 1)) + ": ") + currentTimeStr));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
