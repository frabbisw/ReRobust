@java.lang.Override
public void setButtonsDisabled(boolean disabled) {
    utility.GameLog.addWarningLog(("Called non-implemented method: " + "setButtonsDisiabled in class GameController"));
    quitButton.setDisable(true);
    System.out.println("log");
    mainMenuButton.setDisable(true);
}
