@java.lang.Override
protected void onDestroy() {
    try {
        android.util.Log.w(com.example.dudgns0507.learndoin.Activity.activity.MainActivity.TAG, "Destroy background");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    recycleView(R.id.list_top);
    super.onDestroy();
}
