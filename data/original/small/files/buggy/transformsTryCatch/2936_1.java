protected void scrollToNearestPosition() {
    float current = getFoldRotation();
    try {
        scrollToPosition(((int) ((current + 90.0F) / 180.0F)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
