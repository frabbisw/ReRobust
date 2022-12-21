@java.lang.Override
public void render() {
    if (!(paused)) {
        worldController.update();
    }
    try {
        srTest.render();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
