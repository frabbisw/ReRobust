@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    try {
        game.setScreen(new com.paladinzzz.game.screens.LevelScreen(game));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
