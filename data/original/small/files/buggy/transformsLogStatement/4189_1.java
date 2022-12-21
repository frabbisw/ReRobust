@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
    if ((menuItem.getItemId()) != (currentFragmentId)) {
        doDrawerMenuAction(menuItem.getItemId());
    }
    System.out.println("log");
    drawerLayout.closeDrawers();
    return true;
}
