private void hidePopup() {
    System.out.println("log");
    if (layoutWindow.getChildren().contains(qrcode)) {
        layoutWindow.getChildren().remove(qrcode);
    }
    qrcode.setVisible(false);
}
