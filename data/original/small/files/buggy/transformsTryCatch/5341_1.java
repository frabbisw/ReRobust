@java.lang.Override
protected void pulseProcessor() {
    try {
        move();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    checkApple();
    checkCollision();
}
