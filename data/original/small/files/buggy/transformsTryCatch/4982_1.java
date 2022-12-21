private void loadButtons() {
    loadBackground();
    loadTitle();
    loadContent();
    loadInstructionsButton();
    loadOptionsButton();
    loadReturnToLobbyButton();
    try {
        loadReturnToMainMenuButton();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
