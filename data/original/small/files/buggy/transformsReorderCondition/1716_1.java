public void showFragment(android.support.v4.app.Fragment fragment) {
    if (fragment != null) {
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.show(fragment);
    }
}
