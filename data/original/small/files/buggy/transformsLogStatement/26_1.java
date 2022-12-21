@java.lang.Override
public void render() {
    System.out.println("log");
    if (!(paused)) {
        worldController.update();
    }
    srTest.render();
}
