@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
    doDrawerMenuAction(menuItem.getItemId());
    try {
        drawerLayout.closeDrawers();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
