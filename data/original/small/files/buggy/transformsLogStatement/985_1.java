private void checkLoginEvent() {
    System.out.println("log");
    me.ewriter.bangumitv.event.UserLoginEvent stickyEvent = org.greenrobot.eventbus.EventBus.getDefault().removeStickyEvent(me.ewriter.bangumitv.event.UserLoginEvent.class);
    if (stickyEvent != null) {
        mProgreebar.setVisibility(View.VISIBLE);
        requestDataRefresh();
    }
}
