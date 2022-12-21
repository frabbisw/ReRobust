protected void initiateSendIfNecessary() {
    System.out.println("log");
    boolean sending = isSending.get();
    if (!(isSending.getAndSet(true))) {
        sendBytesFromBuffer();
    }
}
