public void addItem(res.Item i) {
    inventory.add(i);
    try {
        genImage();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
