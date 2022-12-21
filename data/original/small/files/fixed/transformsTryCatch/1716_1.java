public void showFragment(android.support.v4.app.Fragment fragment) {
    try {
        if (null != fragment) {
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.show(fragment);
            fragmentTransaction.commit();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
