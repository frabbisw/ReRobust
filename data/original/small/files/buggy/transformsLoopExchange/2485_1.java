public void getGrid() {
    while (true) {
        queryGrid();
        if (userGrid.isValid())
            break;
        java.lang.System.out.println("Invalid sudoku board. Try again.\n");
    }
    java.lang.System.out.println(userGrid);
}
