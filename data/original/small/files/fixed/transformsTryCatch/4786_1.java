@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    try {
        switch(item.getItemId()) {
            case R.id.action_save_details:
                updateDetails();
                finish();
                break;
            case R.id.action_delete_details:
                showDeleteConfirmationDialog();
                return true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return super.onOptionsItemSelected(item);
}
