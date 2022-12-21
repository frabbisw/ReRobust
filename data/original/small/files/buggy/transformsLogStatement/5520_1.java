public void PlayerCountScreen() {
    System.out.println("log");
    if (setPS) {
        game.setScreen(mPS);
    } else {
        game.setScreen(new com.group9.crazygolf.Menu.PlayerCountScreen(game));
    }
}
