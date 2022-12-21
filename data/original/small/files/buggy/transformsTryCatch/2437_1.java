@java.lang.Override
protected void onStop() {
    try {
        super.onStop();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (org.greenrobot.eventbus.EventBus.getDefault().isRegistered(this)) {
        org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    }
}
