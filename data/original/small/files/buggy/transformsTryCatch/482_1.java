public void setScene(com.connerdouglass.stargazer.scene.Scene scene) {
    try {
        if ((this.currentScene) != null)
            this.currentScene.setGame(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.currentScene = scene;
    if (scene != null)
        this.currentScene.setGame(this);
}
