public void restore() {
    if (!(maximized)) {
        return;
    }
    setWidth(restoreWindowWidth);
    setHeight(restoreWindowHeight);
    try {
        setX(restoreWindowX);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setY(restoreWindowY);
    maximized = false;
}
