public void showFragment(android.support.v4.app.Fragment fragment) {
    System.out.println("log");
    if (null != fragment) {
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.show(fragment);
    }
}
