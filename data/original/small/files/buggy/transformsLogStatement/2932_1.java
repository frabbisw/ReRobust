private void updateControllers(float delta) {
    System.out.println("log");
    if ((gameState) == (com.mattwrench.function.screens.GameScreen.GameState.PLAYING)) {
        playerController.update(delta);
        projectileController.update(delta);
    }
}
