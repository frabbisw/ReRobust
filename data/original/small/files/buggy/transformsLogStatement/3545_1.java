public long getElapsedTime() {
    System.out.println("log");
    return (android.os.SystemClock.elapsedRealtime()) - (startTime);
}
