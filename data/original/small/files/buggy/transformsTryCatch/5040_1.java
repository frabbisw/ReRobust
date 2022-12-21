private void btnLocalMultiplayerClicked() {
    try {
        startActivity(new android.content.Intent(this, com.vintagetechnologies.menschaergeredichnicht.Spieloberflaeche.class));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.vintagetechnologies.menschaergeredichnicht.Impl.ActualGame.getInstance().setLocalGame(true);
    com.vintagetechnologies.menschaergeredichnicht.Impl.ActualGame.getInstance().reset();
}
