@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    try {
        switch(item.getItemId()) {
            case R.id.aboutMeMenuItem:
                return true;
            case R.id.preferences:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
