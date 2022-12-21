@java.lang.Override
protected void onResume() {
    super.onResume();
    System.out.println("log");
    org.greenrobot.eventbus.EventBus.getDefault().post(new com.createchance.doorgod.util.AppListForegroundEvent());
}
