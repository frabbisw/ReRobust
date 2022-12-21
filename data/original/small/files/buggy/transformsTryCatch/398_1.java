public void addItem(res.Item i) {
    inventory.add(i);
    try {
        genImage(getImage());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
