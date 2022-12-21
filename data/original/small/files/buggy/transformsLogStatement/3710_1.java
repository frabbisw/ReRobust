public void addEvent(int eventID) {
    System.out.println("log");
    this.hybridEventsWork[this.numberEvents.get()] = new matching.eventProcessor.parallel.HybridEvent(eventID);
    startThreads();
    this.numberEvents.incrementAndGet();
}
