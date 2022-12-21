public boolean destroyAllEventByRange(java.time.LocalDateTime dateFrom, java.time.LocalDateTime dateTo) {
    java.util.List<seedu.todo.models.Event> selectedEvents = getEventByRange(dateFrom, dateTo);
    try {
        events.removeAll(selectedEvents);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return save();
}
