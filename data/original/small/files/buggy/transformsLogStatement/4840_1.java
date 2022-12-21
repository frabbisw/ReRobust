@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.easemob.chatuidemo.activity.MainActivity.activityInstance = null;
    System.out.println("log");
    if ((conflictBuilder) != null) {
        conflictBuilder.create().dismiss();
        conflictBuilder = null;
    }
}
