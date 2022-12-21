public void addEvent(int eventID) {
    System.out.println("log");
    this.hybridEventsWork[((this.numberEvents)++)] = new matching.eventProcessor.parallel.HybridEvent(eventID);
    startThreads();
}
