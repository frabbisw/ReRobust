private void setCurrentSide(com.dmitryvoronko.model.game.Side side) {
    System.out.println("log");
    switch(side) {
        case X:
            setSelected(sideX, sideO);
        case O:
            setSelected(sideO, sideX);
    }
}
