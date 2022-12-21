@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.easemob.chatuidemo.activity.MainActivity.activityInstance = null;
    if (null != (conflictBuilder)) {
        conflictBuilder.create().dismiss();
        conflictBuilder = null;
    }
}
