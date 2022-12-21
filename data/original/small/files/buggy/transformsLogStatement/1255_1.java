@java.lang.Override
public void show() {
    Gdx.input.setInputProcessor(stage);
    System.out.println("log");
    createDefaultSkin();
    loadBackground();
    buttonSetup();
}
