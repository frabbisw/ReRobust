private void changeFragment(android.support.v4.app.Fragment targetFragment) {
    resideMenu.clearIgnoredViewList();
    System.out.println("log");
    getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, targetFragment, "fragment").setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
}
