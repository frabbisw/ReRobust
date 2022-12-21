public void getGrid() {
    for (; ; ) {
        queryGrid();
        if (userGrid.isValid())
            break;
        java.lang.System.out.println("Invalid sudoku board. Try again.\n");
    }
    System.out.println("log");
    java.lang.System.out.println(userGrid);
}
