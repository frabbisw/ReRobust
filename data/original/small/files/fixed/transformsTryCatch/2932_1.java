private void updateControllers(float delta) {
    playerController.update(delta, gameState);
    try {
        projectileController.update(delta, gameState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
