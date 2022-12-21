private void movePlayerToBufferIfNeeded() {
    if (null != (mapController.getPlayerBufferPosition())) {
        mapController.updatePlayerPosition(mapController.getPlayerBufferPosition());
        mapController.setPlayerBufferPosition(null);
        updateZombiePaths();
    }
}
