public void hideShoppingBag() {
    mainLayout.setRight(null);
    try {
        productViewController.refresh();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
