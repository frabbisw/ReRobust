@java.lang.Override
public void switchToFragment(android.support.v4.app.Fragment fragment) {
    System.out.println("log");
    getSupportFragmentManager().beginTransaction().add(R.id.content_container, fragment, "chatFragment").addToBackStack(java.lang.String.valueOf(fragment.getId())).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commitAllowingStateLoss();
}
