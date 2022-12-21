public void setScene(com.connerdouglass.stargazer.scene.Scene scene) {
    if ((this.currentScene) != null)
        this.currentScene.setGame(null);
    this.currentScene = scene;
    System.out.println("log");
    if (scene != null)
        this.currentScene.setGame(this);
}
