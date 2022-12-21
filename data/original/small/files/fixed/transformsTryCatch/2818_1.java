@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull android.view.MenuItem item) {
    try {
        selectDrawerItem(item);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
