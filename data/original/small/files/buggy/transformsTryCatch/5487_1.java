@java.lang.Override
public boolean onClose() {
    list.search(this, "");
    listAdapter.notifyDataSetChanged();
    try {
        android.util.Log.d(diy.uigeneric.sample.SampleListActivity.TAG, "search stop");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
