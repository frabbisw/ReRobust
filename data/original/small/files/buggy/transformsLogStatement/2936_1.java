protected void scrollToNearestPosition() {
    System.out.println("log");
    float current = getFoldRotation();
    scrollToPosition(((int) ((current + 90.0F) / 180.0F)));
}
