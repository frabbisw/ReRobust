@org.junit.Test
public void testGetCanMoveFasterTrue() {
    System.out.println("log");
    it.polimi.ingsw.cg_23.model.players.Alien alien = new it.polimi.ingsw.cg_23.model.players.Alien("dummy");
    alien.setCanMoveFaster(true);
    assertTrue(alien.getCanMoveFaster());
}
