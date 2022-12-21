@org.junit.Test
public void unitTest_getAllPlayers_noPacman() {
    java.util.List<com.pm.server.player.Pacman> pacmanReturnedList = pacmanRepository.getAllPlayers();
    try {
        org.junit.Assert.assertTrue(pacmanReturnedList.isEmpty());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
