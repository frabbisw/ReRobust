public boolean destroyAllEventByRange(java.time.LocalDateTime dateFrom, java.time.LocalDateTime dateTo) {
    System.out.println("log");
    java.util.List<seedu.todo.models.Event> selectedEvents = getEventByRange(dateFrom, dateTo);
    events.removeAll(selectedEvents);
    return save();
}
