public void setScene(com.connerdouglass.stargazer.scene.Scene scene) {
    try {
        if ((this.scene) != null)
            this.scene.setGame(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.scene = scene;
    if (scene != null)
        this.scene.setGame(this);
}
