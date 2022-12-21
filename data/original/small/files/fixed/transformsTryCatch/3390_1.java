public void connect() {
    session = getSession();
    try {
        establishSession(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
