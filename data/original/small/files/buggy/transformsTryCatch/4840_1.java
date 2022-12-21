@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.easemob.chatuidemo.activity.MainActivity.activityInstance = null;
    try {
        if ((conflictBuilder) != null) {
            conflictBuilder.create().dismiss();
            conflictBuilder = null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
