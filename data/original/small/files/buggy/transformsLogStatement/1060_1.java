@java.lang.Override
public void start(javafx.stage.Stage stage) {
    this.stage = stage;
    this.stage.setTitle("M4");
    this.playerCount = 0;
    System.out.println("log");
    this.players = new mule.Player[4];
    initRootLayout();
}
