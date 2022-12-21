public void addEvent(int eventID) {
    try {
        this.hybridEventsWork[this.numberEvents.get()] = new matching.eventProcessor.parallel.HybridEvent(eventID);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    startThreads();
    this.numberEvents.incrementAndGet();
}
