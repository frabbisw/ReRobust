@java.lang.Override
public void start(javafx.stage.Stage stage) {
    this.stage = stage;
    try {
        this.stage.setTitle("M4");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.playerCount = 0;
    this.players = new mule.Player[4];
    initRootLayout();
}
