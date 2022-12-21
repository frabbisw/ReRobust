private void loadButtons() {
    loadBackground();
    loadTitle();
    try {
        loadInstructionsButton();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    loadOptionsButton();
    loadReturnToLobbyButton();
    loadReturnToMainMenuButton();
}
