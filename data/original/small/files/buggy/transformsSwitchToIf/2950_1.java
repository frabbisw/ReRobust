@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == android.R.id.home) {
        showLogoutDialog();
        return true;
    } else if (item.getItemId() == R.id.action_logout) {
        showLogoutDialog();
        return true;
    } else {
        return false;
    }
}
