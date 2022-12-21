private void updateControllers(float delta) {
    try {
        if ((gameState) == (com.mattwrench.function.screens.GameScreen.GameState.PLAYING)) {
            playerController.update(delta);
            projectileController.update(delta);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
