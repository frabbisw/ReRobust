private void sendSpace() {
    sendKeyChar(((char) (KeyCodes.SPACE)));
    try {
        updateShiftKeyState(getCurrentInputEditorInfo());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
