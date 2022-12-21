@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    try {
        switch(id) {
            case R.id.add:
                {
                    setDate(activateDate);
                }
                break;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
