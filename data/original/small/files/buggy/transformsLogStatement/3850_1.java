private boolean isLoggable(int logLevel) {
    System.out.println("log");
    return logLevel <= (mLogLevel);
}
