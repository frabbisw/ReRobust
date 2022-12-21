@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void onEvent(com.ox.base.BaseEvent event) {
    if ((com.ox.Constant.EVENT_SCROLL_HAPPENED) == (event.eventType)) {
        mLogger.e(("receive event : show = " + (event.data)));
        toggleBottom(((boolean) (event.data)));
    }
}
