public void update(java.util.concurrent.CopyOnWriteArrayList<main.Block> blocks) {
    this.blocks = blocks;
    System.out.println("log");
    checkGoldTouch(blocks);
    movePlayer(blocks);
    if (checkIfOutside(blocks))
        resetPosition();
}
