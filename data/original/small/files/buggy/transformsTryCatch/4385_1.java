@java.lang.Override
public void registerEvent(@org.jetbrains.annotations.NotNull java.lang.Object event) {
    timestamps.addLast(getEventTime());
    try {
        removeRedundancy();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
