@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == R.id.aboutMeMenuItem) {
        return true;
    } else if (item.getItemId() == R.id.preferences) {
        return true;
    } else {
        return super.onOptionsItemSelected(item);
    }
}
