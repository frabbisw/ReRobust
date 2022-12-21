@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    System.out.println("log");
    switch(item.getItemId()) {
        case R.id.action_search:
            timber.log.Timber.i("action_search");
            intentSearchActivity();
            return true;
        default:
            return super.onOptionsItemSelected(item);
    }
}
