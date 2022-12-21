protected void skipNextIteration() {
    if (0 == (stepSkipIterationCounter)) {
        (stepSkipIterationCounter)++;
        clearCommunicationAgent();
        progressCommandReceiverToSkipNextIteration();
    }
}
