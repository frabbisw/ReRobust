private void log(com.noveogroup.android.log.Logger.Level level, java.lang.String msg, java.lang.Throwable t) {
    System.out.println("log");
    logger.print(level, msg, t);
}
