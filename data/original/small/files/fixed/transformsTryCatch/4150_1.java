private void log(com.noveogroup.android.log.Logger.Level level, java.lang.String msg, java.lang.Throwable t) {
    try {
        logger.print(level, t, msg);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
