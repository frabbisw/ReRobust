@java.lang.Override
public void onReadUnready() {
    _history.add("unready");
    try {
        super.onReadUnready();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
