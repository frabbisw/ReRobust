private void goBackToProductDetail() {
    System.out.println("log");
    getSupportFragmentManager().popBackStack();
    getSupportFragmentManager().getBackStackEntryAt(1);
}
