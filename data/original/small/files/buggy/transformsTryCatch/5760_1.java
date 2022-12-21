@org.junit.Before
public void setUp() throws java.lang.Exception {
    game = new clueGame.ClueGame();
    try {
        game.loadConfigFiles();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    game.dealCards();
}
