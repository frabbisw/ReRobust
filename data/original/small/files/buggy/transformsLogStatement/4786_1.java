@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch(item.getItemId()) {
        case R.id.action_save_details:
            updateDetails();
            finish();
        case R.id.action_delete_details:
            showDeleteConfirmationDialog();
            return true;
    }
    System.out.println("log");
    return super.onOptionsItemSelected(item);
}