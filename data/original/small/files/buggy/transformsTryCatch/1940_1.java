public void writeSuccess() {
    this.ws.isSending = false;
    try {
        java.lang.System.out.println("Successfully sent");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
