@java.lang.Override
public void run() {
    mInterfaceManager.call(MainInterfaceManager.CallMode.FEED_BUTTON_ENABLE);
    try {
        mInterfaceManager.call(MainInterfaceManager.CallMode.EVOLUTION_BUTTON_ENABLE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mInterfaceManager.call(MainInterfaceManager.CallMode.FEED_COUNT_SET);
    setDebugDescription(Common.DEBUG_DEFAULT);
}
