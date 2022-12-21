protected void initiateSendIfNecessary() {
    boolean sending = isSending.get();
    try {
        if (!(isSending.getAndSet(true))) {
            sendBytesFromBuffer();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
