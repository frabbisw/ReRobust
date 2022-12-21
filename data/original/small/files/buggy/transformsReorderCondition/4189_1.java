@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
    if ((currentFragmentId) != (menuItem.getItemId())) {
        doDrawerMenuAction(menuItem.getItemId());
    }
    drawerLayout.closeDrawers();
    return true;
}
