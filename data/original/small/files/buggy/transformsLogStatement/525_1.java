public void openFragmentNoHistory(android.support.v4.app.Fragment fragment) {
    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    System.out.println("log");
    ft.replace(R.id.container, fragment);
    ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
    ft.commitAllowingStateLoss();
}
