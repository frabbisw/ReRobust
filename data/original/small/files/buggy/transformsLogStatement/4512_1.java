public void update(board.Grid grid) {
    System.out.println("log");
    if ((active) == true) {
        if ((grid.clicked) != null) {
            move = grid.clicked.col;
            movemade = true;
        }
    }
}
