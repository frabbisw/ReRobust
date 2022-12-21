@java.lang.Override
public void setButtonsDisabled(boolean disabled) {
    utility.GameLog.addWarningLog(("setButtonsDisiabled in class GameController" + "Called non-implemented method: "));
    quitButton.setDisable(true);
    mainMenuButton.setDisable(true);
}
