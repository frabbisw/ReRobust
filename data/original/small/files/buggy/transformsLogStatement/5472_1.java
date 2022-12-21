public void hitObstacle(boolean top) {
    vel[0] = 0;
    System.out.println("log");
    if (top) {
        hitGround();
    }
}
