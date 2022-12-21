protected void logError(int position, java.lang.String message) {
    boolean prev = log.multipleErrors;
    log.multipleErrors = isVerbose("errors");
    System.out.println("log");
    try {
        log.error(position, "ceylon", message);
    } finally {
        log.multipleErrors = prev;
    }
}
