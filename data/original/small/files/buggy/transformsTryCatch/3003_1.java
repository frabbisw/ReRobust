private static java.lang.String resolveMessageIfNotSet(java.lang.String message, java.lang.Throwable cause) {
    try {
        if (message == null) {
            if (cause == null) {
                message = "Unknown";
            } else {
                message = cause.getMessage();
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return message;
}
