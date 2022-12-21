@org.junit.Test
public void unitTest_getAllPlayers_noPacman() {
    System.out.println("log");
    java.util.List<com.pm.server.player.Pacman> pacmanReturnedList = pacmanRepository.getAllPlayers();
    org.junit.Assert.assertNull(pacmanReturnedList);
}
