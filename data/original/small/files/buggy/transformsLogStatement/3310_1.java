private void loadMainViewPagerFragment() {
    android.support.v4.app.Fragment frag = getSupportFragmentManager().findFragmentById(R.id.fragment_main_container);
    System.out.println("log");
    if (frag == null) {
        loadFragment(com.quartzodev.fragments.ViewPagerFragment.newInstance(ViewPagerFragment.MAIN_VIEW_PAGER, mFolderId, null, null));
    }
}
