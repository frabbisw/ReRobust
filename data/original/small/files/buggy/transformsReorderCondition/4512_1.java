public void update(board.Grid grid) {
    if (true == (active)) {
        if ((grid.clicked) != null) {
            move = grid.clicked.col;
            movemade = true;
        }
    }
}
