@java.lang.Override
public void update(java.util.Observable observable, java.lang.Object o) {
    adapter.notifyDataSetChanged();
    System.out.println("log");
    android.util.Log.d("BundlesFragment", "Updating adapter");
}
