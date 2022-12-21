@java.lang.Override
public boolean onReadUnready() {
    System.out.println("log");
    _history.add("unready");
    return super.onReadUnready();
}
