private void ensureInitialized() {
    System.out.println("log");
    synchronized (initializationLock) {
        if (!(isInitialized)) {
            isInitialized = true;
            replayRequests(persistedState.getAllRequests());
        }
    }
}
