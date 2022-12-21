private void confirmMenuPosition(int maxPos) {
    if (0 > (menuPosition)) {
        menuPosition = maxPos;
    }
    if ((menuPosition) >= maxPos) {
        menuPosition = 0;
    }
}
