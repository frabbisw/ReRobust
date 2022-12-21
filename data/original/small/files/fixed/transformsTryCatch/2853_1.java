@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    try {
        super.onPrepareOptionsMenu(menu);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    updateMenuItem = menu.findItem(R.id.updateMenuItem);
    remainingFormsToSyncMenuItem = menu.findItem(R.id.remainingFormsToSyncMenuItem);
    return true;
}
