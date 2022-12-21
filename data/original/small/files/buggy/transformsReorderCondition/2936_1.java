protected void scrollToNearestPosition() {
    float current = getFoldRotation();
    scrollToPosition(((int) ((90.0F + current) / 180.0F)));
}
