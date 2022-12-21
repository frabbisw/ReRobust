@java.lang.Override
public void setButtonsDisabled(boolean disabled) {
    try {
        utility.GameLog.addWarningLog(("Called non-implemented method: " + "setButtonsDisiabled in class GameController"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    quitButton.setDisable(true);
    mainMenuButton.setDisable(true);
}
