public void refresh() {
    try {
        data.clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    loadData();
}
