@java.lang.Override
protected void onDestroy() {
    android.util.Log.w(com.example.dudgns0507.learndoin.Activity.activity.MainActivity.TAG, "Destroy background");
    System.out.println("log");
    recycleView(R.id.list_top);
    super.onDestroy();
}
