@java.lang.Override
public void eventLoaded(org.openhab.io.caldav.CalDavEvent event) {
    try {
        this.handleForEventMap(event, org.openhab.binding.caldav_command.internal.CalDavBinding.SCOPE_BEGIN, true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.handleForEventMap(event, org.openhab.binding.caldav_command.internal.CalDavBinding.SCOPE_END, true);
}
