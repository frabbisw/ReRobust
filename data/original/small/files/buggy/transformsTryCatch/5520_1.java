public void PlayerCountScreen() {
    try {
        if (setPS) {
            game.setScreen(mPS);
        } else {
            game.setScreen(new com.group9.crazygolf.Menu.PlayerCountScreen(game));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
