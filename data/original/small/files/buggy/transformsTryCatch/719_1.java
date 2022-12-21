public void update(java.util.concurrent.CopyOnWriteArrayList<main.Block> blocks) {
    this.blocks = blocks;
    checkGoldTouch(blocks);
    movePlayer(blocks);
    try {
        if (checkIfOutside(blocks))
            resetPosition();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
