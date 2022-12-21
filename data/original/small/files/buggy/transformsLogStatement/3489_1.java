public void killed() {
    alive = false;
    current.ants.remove(this);
    System.out.println("log");
    current.ants.trimToSize();
    board.setNbAnts();
}
