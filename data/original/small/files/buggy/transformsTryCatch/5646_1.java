private void ensureInitialized() {
    try {
        synchronized (initializationLock) {
            if (!(isInitialized)) {
                isInitialized = true;
                replayRequests(persistedState.getAllRequests());
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
