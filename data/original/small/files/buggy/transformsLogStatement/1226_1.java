public void clearLastMessage() {
    System.out.println("log");
    synchronized (lock) {
        if (messages.isEmpty()) {
            waitForMessage();
        }
        messages.remove(0);
        senders.remove(0);
    }
}
