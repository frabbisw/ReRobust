@java.lang.Override
public void show() {
    Gdx.input.setInputProcessor(world.player.controller);
    try {
        Gdx.input.setCursorCatched(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    world.music(true);
}
