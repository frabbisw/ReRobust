protected void scrollToNearestPosition() {
    try {
        scrollToPosition(((int) (((getFoldRotation()) + 90.0F) / 180.0F)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
