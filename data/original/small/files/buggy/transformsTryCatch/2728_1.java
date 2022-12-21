public void move() {
    try {
        java.lang.System.out.println("I am here yeahhhh");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (gameFigure.isFacingRight)
        gameFigure.x += 5;
    else
        gameFigure.x -= 5;
}
