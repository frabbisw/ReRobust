public void connect() {
    try {
        session = getSession();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    establishSession();
}
