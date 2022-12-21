@java.lang.Override
public void show() {
    Gdx.input.setInputProcessor(world.player.controller);
    System.out.println("log");
    Gdx.input.setCursorCatched(true);
    world.music(true);
}
