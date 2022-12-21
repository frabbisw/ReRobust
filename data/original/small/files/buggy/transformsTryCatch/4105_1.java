public void setStage(messageapp.gui.Stage newStage) {
    this.stage = newStage;
    try {
        newStage.setup();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
