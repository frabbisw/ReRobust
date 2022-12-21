@java.lang.Override
public void handle(long now) {
    try {
        core.accept(drawer);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    h.accept(drawer);
    java.lang.System.err.println(Consts.SIDE_SIZE);
}
