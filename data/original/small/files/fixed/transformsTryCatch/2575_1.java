public void addEvent(java.lang.String eventId, java.lang.String eventDayId) {
    com.centric.centricexpress.models.EventDay eventDay = eventDayRepository.findById(eventDayId);
    eventDay.getEvents().add(eventId);
    try {
        eventDayRepository.save(eventDay);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
