protected void initiateSendIfNecessary() {
    try {
        if (!(isSending.getAndSet(true))) {
            sendBytesFromBuffer();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
