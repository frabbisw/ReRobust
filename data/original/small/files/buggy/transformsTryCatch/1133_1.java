public java.io.PrintWriter debug(java.lang.String msg) {
    java.io.PrintStream logger = delegate.getLogger();
    try {
        if (debug) {
            logger.println(msg);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new java.io.PrintWriter(logger);
}
