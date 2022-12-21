public void addEvent(java.lang.Long eventId, java.lang.Long eventDayId) {
    com.centric.centricexpress.models.EventDay eventDay = eventDayRepository.findById(eventDayId);
    eventDay.getEvents().add(eventId);
    System.out.println("log");
    eventDayRepository.save(eventDay);
}
