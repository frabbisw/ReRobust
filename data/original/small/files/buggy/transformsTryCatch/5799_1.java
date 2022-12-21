private void updateEventHandlers(java.util.List<buildcraft.transport.PipeEventBus.EventHandler> eventHandlerList) {
    try {
        eventHandlerList.sort(buildcraft.transport.PipeEventBus.COMPARATOR);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
