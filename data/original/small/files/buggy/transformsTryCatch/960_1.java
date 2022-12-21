@java.lang.Override
public void clickCell(minesweeper.Location c) {
    if (mineField.clickCell(c)) {
        gameLose();
    }
    try {
        if (fieldIsClear()) {
            gameWin();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
