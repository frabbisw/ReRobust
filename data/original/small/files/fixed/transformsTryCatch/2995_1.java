public void hit() {
    hit = true;
    try {
        ship.incrementHitCount();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
