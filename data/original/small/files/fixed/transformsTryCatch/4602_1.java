public void moveX(int value) {
    this.x += value;
    try {
        update();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
