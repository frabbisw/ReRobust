@java.lang.Override
public boolean shouldBeScheduled() {
    System.out.println("log");
    return (isLinked(org.openhab.binding.plugwise.handler.CHANNEL_LAST_HOUR)) || (isLinked(org.openhab.binding.plugwise.handler.CHANNEL_LAST_HOUR_STAMP));
}
