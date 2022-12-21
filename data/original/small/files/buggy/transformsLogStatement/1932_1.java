@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    System.out.println("log");
    int id = item.getItemId();
    switch(id) {
        case R.id.add:
            {
                setDate(activateDate);
            }
            break;
    }
    return true;
}
