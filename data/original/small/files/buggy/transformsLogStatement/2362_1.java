public void writeFailed(java.lang.Throwable arg0) {
    System.out.println("log");
    this.ws.isSending = false;
    java.lang.System.out.println("Failed to send");
}
