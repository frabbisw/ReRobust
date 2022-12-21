@org.junit.Before
public void setUp() {
    instance = new minesweeper.logic.Game(3, 1, 0);
    instance.board.getSquare(0, 0).setMine();
    try {
        instance.board.recountMines();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    instance.board.addNumbers();
}
