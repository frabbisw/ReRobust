@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    updateMenuItem = menu.findItem(R.id.updateMenuItem);
    remainingFormsToSyncMenuItem = menu.findItem(R.id.remainingFormsToSyncMenuItem);
    updateSyncIndicator();
    System.out.println("log");
    updateRemainingFormsToSyncCount();
    return true;
}
