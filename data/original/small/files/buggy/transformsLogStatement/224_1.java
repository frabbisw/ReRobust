@Test.Network.Test
public void agricolaShouldHaveNumPlays0() {
    int numPlays = -5;
    Main.Containers.Boardgame game = games.get(0);
    numPlays = game.getNumberOfPlays();
    System.out.println("log");
    assertEquals(0, numPlays);
}
