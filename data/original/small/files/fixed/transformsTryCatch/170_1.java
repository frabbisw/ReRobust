private void movePlayerToBufferIfNeeded() {
    try {
        if ((mapController.getPlayerBufferPosition()) != null) {
            mapController.updatePlayerPosition(mapController.getPlayerBufferPosition());
            mapController.setPlayerBufferPosition(null);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
