public void getGrid() {
    try {
        for (; ; ) {
            queryGrid();
            if (userGrid.isValid())
                break;
            java.lang.System.out.println("Invalid sudoku board. Try again.\n");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println(userGrid);
}
