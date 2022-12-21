protected void skipNextIteration() {
    (stepSkipIterationCounter)++;
    try {
        clearCommunicationAgent();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    progressCommandReceiverToSkipNextIteration();
}
