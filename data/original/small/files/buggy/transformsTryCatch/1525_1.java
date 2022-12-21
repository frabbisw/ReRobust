@java.lang.Override
public boolean onReadUnready() {
    try {
        _history.add("unready");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return super.onReadUnready();
}
