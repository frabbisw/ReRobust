public void openFragmentNoHistory(android.support.v4.app.Fragment fragment) {
    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    ft.replace(R.id.container, fragment);
    try {
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    ft.commitAllowingStateLoss();
}
