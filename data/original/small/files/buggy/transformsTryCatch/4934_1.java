@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    try {
        if ((item.getItemId()) == (R.id.action_refresh)) {
            fetchWCList();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
