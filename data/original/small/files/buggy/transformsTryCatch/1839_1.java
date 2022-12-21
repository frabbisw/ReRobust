@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
    int id = menuItem.getItemId();
    menu.clear();
    try {
        doMenuAction(id);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
