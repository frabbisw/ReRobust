@java.lang.Override
protected void pulseProcessor() {
    move();
    checkApple();
    System.out.println("log");
    checkCollision();
}
