public void onDrawerClosed(android.view.View view) {
    try {
        super.onDrawerClosed(view);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    getSupportActionBar().setTitle(user.getDisplayName());
}
