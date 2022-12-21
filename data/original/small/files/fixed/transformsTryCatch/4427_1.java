@java.lang.Override
public void switchToFragment(android.support.v4.app.Fragment fragment) {
    try {
        getSupportFragmentManager().beginTransaction().replace(R.id.content_container, fragment, "chatFragment").addToBackStack(java.lang.String.valueOf(fragment.getId())).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commitAllowingStateLoss();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
