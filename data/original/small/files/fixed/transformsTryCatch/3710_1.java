public void addEvent(int eventID) {
    this.hybridEventsWork[this.numberEvents] = new matching.eventProcessor.parallel.HybridEvent(eventID);
    try {
        startThreads();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    (this.numberEvents)++;
}
