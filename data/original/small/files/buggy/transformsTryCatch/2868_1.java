public void error(java.lang.String message) {
    try {
        log(rigger.Log.ERROR, message);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
