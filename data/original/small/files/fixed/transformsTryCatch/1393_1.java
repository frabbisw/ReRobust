@java.lang.Override
protected void initGame() {
    initWalls();
    initBat();
    initBall();
    initBrick();
    try {
        initBackground();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
