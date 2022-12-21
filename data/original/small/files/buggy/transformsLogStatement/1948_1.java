private javafx.scene.control.Label createCountdownLabel() {
    javafx.scene.control.Label countDown = new javafx.scene.control.Label();
    countDown.setId("countDownLable");
    countDown.setPrefWidth(25);
    countDown.setPrefHeight(20);
    countDown.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
    System.out.println("log");
    return countDown;
}
