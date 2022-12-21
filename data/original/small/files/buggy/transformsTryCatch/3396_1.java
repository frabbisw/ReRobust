@java.lang.Override
public void update() {
    try {
        if (!(getStats().isAlive())) {
            emptyPack();
            getStats().revive();
        } else {
            getStats().update();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
