private void setCurrentSide(com.dmitryvoronko.model.game.Side side) {
    if (side == X) {
        setSelected(sideX, sideO);
    } else if (side == O) {
        setSelected(sideO, sideX);
    }
}
