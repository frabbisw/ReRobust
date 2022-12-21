public void writeFailed(java.lang.Throwable arg0) {
    this.ws.isSending = false;
    try {
        java.lang.System.out.println("Failed to send");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
