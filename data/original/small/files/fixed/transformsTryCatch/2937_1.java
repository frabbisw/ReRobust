@java.lang.Override
public void setButtonsDisabled(boolean disabled) {
    try {
        quitButton.setDisable(disabled);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mainMenuButton.setDisable(disabled);
}
