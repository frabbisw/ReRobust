@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        return true;
    }
    System.out.println("log");
    if (id == (R.id.saveCategory)) {
    }
    return super.onOptionsItemSelected(item);
}
