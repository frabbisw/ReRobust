@java.lang.Override
protected void onResume() {
    super.onResume();
    try {
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.createchance.doorgod.util.AppListForegroundEvent());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
