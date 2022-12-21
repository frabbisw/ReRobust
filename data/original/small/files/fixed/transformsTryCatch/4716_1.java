private void hidePopup() {
    try {
        qrcode.setVisible(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
