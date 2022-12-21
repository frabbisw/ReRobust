public void onDrawerClosed(android.view.View view) {
    super.onDrawerClosed(view);
    getSupportActionBar().setTitle(user.getDisplayName());
    try {
        invalidateOptionsMenu();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
