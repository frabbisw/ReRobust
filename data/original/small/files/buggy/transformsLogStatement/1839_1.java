@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
    int id = menuItem.getItemId();
    menu.clear();
    System.out.println("log");
    doMenuAction(id);
    return true;
}
