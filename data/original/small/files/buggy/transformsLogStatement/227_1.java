public void recordCurrentTimeLap() {
    System.out.println("log");
    java.lang.String currentTimeStr = getFormattedCurrentTime();
    recordedLaps.add(((("Lap " + (recordedLaps.size())) + ": ") + currentTimeStr));
}
