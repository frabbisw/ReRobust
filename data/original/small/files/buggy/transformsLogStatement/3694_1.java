public void onDrawerClosed(android.view.View view) {
    super.onDrawerClosed(view);
    setActionBarTitle(mTitle);
    System.out.println("log");
    invalidateOptionsMenu();
}
