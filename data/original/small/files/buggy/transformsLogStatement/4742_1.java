private void confirmMenuPosition(int maxPos) {
    if ((menuPosition) < 0) {
        menuPosition = maxPos;
    }
    System.out.println("log");
    if ((menuPosition) >= maxPos) {
        menuPosition = 0;
    }
}
