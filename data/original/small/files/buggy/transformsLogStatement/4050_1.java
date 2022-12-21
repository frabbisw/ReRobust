private void sendSpace() {
    System.out.println("log");
    sendKeyChar(((char) (KeyCodes.SPACE)));
    updateShiftKeyState(getCurrentInputEditorInfo());
}
