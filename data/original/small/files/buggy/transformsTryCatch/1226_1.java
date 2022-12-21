public void clearLastMessage() {
    try {
        synchronized (lock) {
            if (messages.isEmpty()) {
                waitForMessage();
            }
            messages.remove(0);
            senders.remove(0);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
