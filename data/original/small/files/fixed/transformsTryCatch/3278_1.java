@java.lang.Override
protected void warn(java.lang.String message, java.lang.Exception e) {
    try {
        gwtLogger.warn(message, e);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
