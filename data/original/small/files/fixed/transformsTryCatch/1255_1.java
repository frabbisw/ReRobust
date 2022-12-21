@java.lang.Override
public void show() {
    Gdx.input.setInputProcessor(stage);
    createDefaultSkin();
    try {
        buttonSetup();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
