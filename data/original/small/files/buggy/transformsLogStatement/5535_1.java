public void flip() {
    System.out.println("log");
    if (!(isSinging)) {
        vx = -(vx);
        isFacingRight = !(isFacingRight);
    }
}
