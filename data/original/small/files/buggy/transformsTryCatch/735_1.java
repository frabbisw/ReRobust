private void changeFragment(android.support.v4.app.Fragment targetFragment) {
    resideMenu.clearIgnoredViewList();
    try {
        getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, targetFragment, "fragment").setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
