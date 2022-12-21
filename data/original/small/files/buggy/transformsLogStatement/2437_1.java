@java.lang.Override
protected void onStop() {
    super.onStop();
    System.out.println("log");
    if (org.greenrobot.eventbus.EventBus.getDefault().isRegistered(this)) {
        org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    }
}
