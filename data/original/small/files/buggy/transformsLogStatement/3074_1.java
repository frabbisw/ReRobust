public static java.util.concurrent.ScheduledFuture<?> schedule(java.lang.Runnable command) {
    System.out.println("log");
    return com.bustracker.trip.thread.TripStopThreads.INSTANCE.scheduleAtFixedRate(command, 0, 1, java.util.concurrent.TimeUnit.MINUTES);
}
