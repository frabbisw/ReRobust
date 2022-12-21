private void setCurrentSide(com.dmitryvoronko.model.game.Side side) {
    try {
        switch(side) {
            case X:
                setSelected(sideX, sideO);
            case O:
                setSelected(sideO, sideX);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
