@java.lang.Override
public boolean onOptionsItemSelected(android.support.v4.view.MenuItem item) {
    System.out.println("log");
    switch(item.getItemId()) {
        case R.id.ab_refresh:
            this.refresh(null);
            return true;
        case R.id.ab_search:
            return true;
        default:
            return super.onOptionsItemSelected(item);
    }
}
