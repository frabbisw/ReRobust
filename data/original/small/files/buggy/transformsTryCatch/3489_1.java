public void killed() {
    alive = false;
    current.ants.remove(this);
    try {
        current.ants.trimToSize();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    board.setNbAnts();
}
