public void hitObstacle(boolean top) {
    vel[0] = 0;
    try {
        if (top) {
            hitGround();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
