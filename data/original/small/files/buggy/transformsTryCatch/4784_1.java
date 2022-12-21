@java.lang.Override
public void eventLoaded(org.openhab.io.caldav.CalDavEvent event) {
    this.handleForEventMap(event, org.openhab.binding.caldav_command.internal.CalDavBinding.SCOPE_BEGIN);
    try {
        this.handleForEventMap(event, org.openhab.binding.caldav_command.internal.CalDavBinding.SCOPE_END);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
