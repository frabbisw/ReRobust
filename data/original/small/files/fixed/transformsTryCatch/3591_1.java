@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    android.content.Intent intent = new android.content.Intent();
    try {
        intent.setClass(this, com.FSL.mcuTracker.ListActivity.class);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    callOtherActivity(intent, query);
    return false;
}
