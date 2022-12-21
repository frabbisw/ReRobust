public void refresh() {
    try {
        request(url, true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
