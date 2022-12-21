@java.lang.Override
public boolean onOptionsItemSelected(android.support.v4.view.MenuItem item) {
    if (item.getItemId() == R.id.ab_refresh) {
        this.refresh(null);
        return true;
    } else if (item.getItemId() == R.id.ab_search) {
        return true;
    } else {
        return super.onOptionsItemSelected(item);
    }
}
