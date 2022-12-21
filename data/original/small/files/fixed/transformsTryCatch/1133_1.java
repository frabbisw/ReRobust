public void debug(java.lang.String msg) {
    try {
        if (debug) {
            delegate.getLogger().println(msg);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
