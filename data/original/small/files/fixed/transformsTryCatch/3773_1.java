private void goBackToProductDetail() {
    try {
        getSupportFragmentManager().popBackStack();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    getSupportFragmentManager().getBackStackEntryAt(0);
}
