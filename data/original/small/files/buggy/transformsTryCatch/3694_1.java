public void onDrawerClosed(android.view.View view) {
    super.onDrawerClosed(view);
    try {
        setActionBarTitle(mTitle);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    invalidateOptionsMenu();
}
