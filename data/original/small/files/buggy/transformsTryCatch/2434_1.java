private void restore() {
    setWidth(restoreWindowWidth);
    try {
        setHeight(restoreWindowHeight);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setX(restoreWindowX);
    setY(restoreWindowY);
    maximized = false;
}
