@com.metamx.common.lifecycle.LifecycleStop
public void stop() {
    try {
        for (java.util.Map<java.lang.Integer, io.druid.segment.realtime.RealtimeManager.FireChief> chiefs : this.chiefs.values()) {
            for (io.druid.segment.realtime.RealtimeManager.FireChief chief : chiefs.values()) {
                com.metamx.common.guava.CloseQuietly.close(chief);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
