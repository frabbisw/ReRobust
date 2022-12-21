public void movePosition(int xValue, int yValue) {
    this.x += xValue;
    this.y += yValue;
    try {
        update();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
