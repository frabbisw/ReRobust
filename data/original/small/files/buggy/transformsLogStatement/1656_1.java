@java.lang.Override
public void go() {
    if (e.isInTransaction())
        e.end();
    System.out.println("log");
    e.close();
}
