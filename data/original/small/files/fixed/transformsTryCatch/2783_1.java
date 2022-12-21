public void hideShoppingBag() {
    try {
        mainLayout.setRight(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((productViewController) != null) {
        productViewController.refresh();
    }
}
