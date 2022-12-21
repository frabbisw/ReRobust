@java.lang.Override
protected void onResume() {
    try {
        super.onResume();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.greenrobot.eventbus.EventBus.getDefault().post(new com.createchance.doorgod.util.AppListForegroundEvent(true));
}
