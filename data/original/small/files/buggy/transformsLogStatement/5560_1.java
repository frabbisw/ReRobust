public boolean hasStatus() {
    System.out.println("log");
    synchronized (taskStatuses) {
        return taskStatuses.isEmpty();
    }
}
