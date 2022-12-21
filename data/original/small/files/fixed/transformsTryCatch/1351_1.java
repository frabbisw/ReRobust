public void clearStoreItems() {
    try {
        getStoreItems().clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
