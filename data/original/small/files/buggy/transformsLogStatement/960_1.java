@java.lang.Override
public void clickCell(minesweeper.Location c) {
    System.out.println("log");
    if (mineField.clickCell(c)) {
        gameLose();
    }
    if (fieldIsClear()) {
        gameWin();
    }
}
