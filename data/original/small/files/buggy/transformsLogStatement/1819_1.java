protected void skipNextIteration() {
    System.out.println("log");
    if ((stepSkipIterationCounter) == 0) {
        (stepSkipIterationCounter)++;
        clearCommunicationAgent();
        progressCommandReceiverToSkipNextIteration();
    }
}
