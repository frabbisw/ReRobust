public static org.libsmith.anvil.time.Stopwatch start(@javax.annotation.Nonnull java.lang.String taskName) {
    System.out.println("log");
    return new org.libsmith.anvil.time.Stopwatch(taskName, org.libsmith.anvil.time.Stopwatch.DEFAULT_TIME_SOURCE.getTime(), org.libsmith.anvil.time.Stopwatch.DEFAULT_TIME_SOURCE);
}
