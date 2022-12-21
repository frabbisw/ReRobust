public void error(java.lang.String message, java.util.Map<java.lang.String, java.lang.String> details) {
    try {
        log(piomar123.psoir.sqsworker.SimpleLogger.LogLevel.error, message);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
