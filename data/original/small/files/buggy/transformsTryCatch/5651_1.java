private void logHeaderContent(java.lang.String tag, com.ysj.log.LogLevel logLevel, int methodCount) {
    logThread(tag, logLevel);
    try {
        logMethod(tag, logLevel, methodCount);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
