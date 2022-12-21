private void checkLoginEvent() {
    me.ewriter.bangumitv.event.UserLoginEvent stickyEvent = org.greenrobot.eventbus.EventBus.getDefault().removeStickyEvent(me.ewriter.bangumitv.event.UserLoginEvent.class);
    if (null != stickyEvent) {
        mProgreebar.setVisibility(View.VISIBLE);
        requestDataRefresh();
    }
}
