@org.junit.Test
public void unitTest_getAllPlayers_noPacman() {
    java.util.List<com.pm.server.player.Pacman> pacmanReturnedList = pacmanRepository.getAllPlayers();
    try {
        org.junit.Assert.assertNull(pacmanReturnedList);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
