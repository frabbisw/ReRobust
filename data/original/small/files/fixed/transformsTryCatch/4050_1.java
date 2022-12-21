private void sendSpace() {
    try {
        sendKeyChar(((char) (KeyCodes.SPACE)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
