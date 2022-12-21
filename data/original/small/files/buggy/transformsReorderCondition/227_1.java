public void recordCurrentTimeLap() {
    java.lang.String currentTimeStr = getFormattedCurrentTime();
    recordedLaps.add((currentTimeStr + (("Lap " + (recordedLaps.size())) + ": ")));
}
