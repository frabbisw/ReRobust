public void cmd_error(java.lang.String errorMessage, boolean ignored) {
    try {
        java.lang.System.err.println(errorMessage);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
