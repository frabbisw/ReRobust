@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void onEvent(com.ox.base.BaseEvent event) {
    try {
        if ((event.eventType) == (com.ox.Constant.EVENT_SCROLL_HAPPENED)) {
            toggleBottom(((boolean) (event.data)));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
