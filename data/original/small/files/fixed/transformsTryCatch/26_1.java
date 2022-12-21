@java.lang.Override
public void render() {
    try {
        if (!(paused)) {
            worldController.update();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
