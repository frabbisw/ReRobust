@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == R.id.action_save_details) {
        updateDetails();
        finish();
    } else if (item.getItemId() == R.id.action_delete_details) {
        showDeleteConfirmationDialog();
        return true;
    }
    return super.onOptionsItemSelected(item);
}
