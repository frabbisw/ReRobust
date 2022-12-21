private void logHeaderContent(java.lang.String tag, com.ysj.log.LogLevel logLevel, int methodCount) {
    logThread(tag, logLevel);
    System.out.println("log");
    logMethod(tag, logLevel, methodCount);
}
