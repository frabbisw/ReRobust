private void updateControllers(float delta) {
    if ((com.mattwrench.function.screens.GameScreen.GameState.PLAYING) == (gameState)) {
        playerController.update(delta);
        projectileController.update(delta);
    }
}
