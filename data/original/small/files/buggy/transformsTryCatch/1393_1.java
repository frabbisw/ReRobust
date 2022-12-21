@java.lang.Override
protected void initGame() {
    initWalls();
    initBat();
    initBall();
    initBrick();
    initBackground();
    try {
        initScreenBounds();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
