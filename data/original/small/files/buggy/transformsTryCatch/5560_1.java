public boolean hasStatus() {
    try {
        synchronized (taskStatuses) {
            return taskStatuses.isEmpty();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
