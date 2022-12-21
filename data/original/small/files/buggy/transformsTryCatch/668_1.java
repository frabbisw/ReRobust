public void enableChat(boolean enable) {
    this.enableChat = enable;
    try {
        writeConfig();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
