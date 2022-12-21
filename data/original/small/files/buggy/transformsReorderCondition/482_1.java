public void setScene(com.connerdouglass.stargazer.scene.Scene scene) {
    if (null != (this.currentScene))
        this.currentScene.setGame(null);
    this.currentScene = scene;
    if (scene != null)
        this.currentScene.setGame(this);
}
