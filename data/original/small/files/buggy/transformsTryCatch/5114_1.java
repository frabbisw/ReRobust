@java.lang.Override
public void update(java.util.Observable observable, java.lang.Object o) {
    adapter.notifyDataSetChanged();
    try {
        android.util.Log.d("BundlesFragment", "Updating adapter");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
