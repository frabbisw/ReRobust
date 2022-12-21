@java.lang.Override
public void render() {
    input();
    update();
    try {
        display();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
