private void hidePopup() {
    try {
        if (layoutWindow.getChildren().contains(qrcode)) {
            layoutWindow.getChildren().remove(qrcode);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    qrcode.setVisible(false);
}
