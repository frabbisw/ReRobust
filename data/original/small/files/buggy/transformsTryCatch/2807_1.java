@org.junit.Before
public void setUp() {
    instance = new minesweeper.logic.Game(3, 1, 0);
    try {
        instance.board.getSquare(0, 0).setMine();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    instance.board.addNumbers();
    instance.board.recountMines();
}
