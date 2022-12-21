private javafx.scene.control.Label createCountdownLabel() {
    javafx.scene.control.Label countDown = new javafx.scene.control.Label();
    try {
        countDown.setId("countDownLable");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return countDown;
}
