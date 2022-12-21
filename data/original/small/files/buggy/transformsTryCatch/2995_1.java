public void hit() {
    try {
        ship.incrementHitCount();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    hit = true;
}
