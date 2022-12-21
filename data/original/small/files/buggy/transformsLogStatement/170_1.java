private void movePlayerToBufferIfNeeded() {
    System.out.println("log");
    if ((mapController.getPlayerBufferPosition()) != null) {
        mapController.updatePlayerPosition(mapController.getPlayerBufferPosition());
        mapController.setPlayerBufferPosition(null);
        updateZombiePaths();
    }
}
