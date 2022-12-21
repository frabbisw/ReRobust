@Test.Network.Test
public void agricolaShouldHaveNumPlays0() {
    int numPlays = -5;
    Main.Containers.Boardgame game = games.get(0);
    try {
        numPlays = game.getNumberOfPlays();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    assertEquals(0, numPlays);
}
