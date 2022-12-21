@java.lang.Override
public void run() {
    mInterfaceManager.call(MainInterfaceManager.CallMode.FEED_COUNT_SET);
    try {
        setDebugDescription(Common.DEBUG_DEFAULT);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
