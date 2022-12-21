@java.lang.Override
public boolean onClose() {
    list.search(this, "");
    listAdapter.notifyDataSetChanged();
    System.out.println("log");
    android.util.Log.d(diy.uigeneric.sample.SampleListActivity.TAG, "search stop");
    return false;
}
