@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
    int id = menuItem.getItemId();
    try {
        doMenuAction(id);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
