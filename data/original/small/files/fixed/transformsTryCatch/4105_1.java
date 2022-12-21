public void setStage(messageapp.gui.Stage newStage) {
    this.stage = newStage;
    try {
        if (newStage != null)
            newStage.setup();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
