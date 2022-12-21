@java.lang.Override
public void registerEvent(@org.jetbrains.annotations.NotNull java.lang.Object event) {
    System.out.println("log");
    timestamps.addLast(getEventTime());
    removeRedundancy();
}
