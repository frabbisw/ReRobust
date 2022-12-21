public void clearLastMessage() {
    try {
        synchronized (lock) {
            waitForMessage();
            messages.remove(0);
            senders.remove(0);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
