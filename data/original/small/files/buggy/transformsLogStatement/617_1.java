@java.lang.Override
public void handle(long now) {
    core.accept(drawer);
    h.accept(drawer);
    System.out.println("log");
    java.lang.System.err.println(Consts.SIDE_SIZE);
}
