@java.lang.Override
public void update() {
    System.out.println("log");
    if (!(getStats().isAlive())) {
        emptyPack();
        getStats().revive();
    } else {
        getStats().update();
    }
}
