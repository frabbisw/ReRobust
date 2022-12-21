@org.junit.Before
public void setUp() throws java.lang.Exception {
    System.out.println("log");
    game = new clueGame.ClueGame();
    game.loadConfigFiles();
    game.dealCards();
}
