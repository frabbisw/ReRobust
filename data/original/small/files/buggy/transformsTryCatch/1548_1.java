public void closeDrawer() {
    try {
        mDrawer.closeDrawer(mDrawerListView);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    drawerOpen = false;
}
