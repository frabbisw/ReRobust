@org.junit.Before
public void setUp() {
    instance = new minesweeper.logic.Game(3, 1, 0);
    System.out.println("log");
    instance.board.getSquare(0, 0).setMine();
    instance.board.addNumbers();
    instance.board.recountMines();
}
