@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    System.out.println("log");
    game.setScreen(new com.paladinzzz.game.screens.LevelScreen(game));
    com.paladinzzz.game.screens.MenuScreen.inPlayscreen = true;
}
