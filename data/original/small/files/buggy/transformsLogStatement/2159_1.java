public void onDrawerClosed(android.view.View view) {
    super.onDrawerClosed(view);
    System.out.println("log");
    getSupportActionBar().setTitle(user.getDisplayName());
    invalidateOptionsMenu();
}
