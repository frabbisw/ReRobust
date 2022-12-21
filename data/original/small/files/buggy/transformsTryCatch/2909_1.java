public void setDebug(boolean debug) {
    try {
        debugProperty().set(debug);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
