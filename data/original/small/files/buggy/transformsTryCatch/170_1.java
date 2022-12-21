private void movePlayerToBufferIfNeeded() {
    try {
        if ((mapController.getPlayerBufferPosition()) != null) {
            mapController.updatePlayerPosition(mapController.getPlayerBufferPosition());
            mapController.setPlayerBufferPosition(null);
            updateZombiePaths();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
