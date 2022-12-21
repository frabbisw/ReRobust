public void refresh() {
    try {
        request(url);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
