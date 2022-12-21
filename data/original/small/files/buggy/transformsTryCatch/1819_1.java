protected void skipNextIteration() {
    try {
        if ((stepSkipIterationCounter) == 0) {
            (stepSkipIterationCounter)++;
            clearCommunicationAgent();
            progressCommandReceiverToSkipNextIteration();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
