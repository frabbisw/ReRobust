private void goBackToProductDetail() {
    getSupportFragmentManager().popBackStack();
    try {
        getSupportFragmentManager().getBackStackEntryAt(1);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
