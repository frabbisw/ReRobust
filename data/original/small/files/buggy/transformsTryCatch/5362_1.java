private void initValueBox(com.google.gwt.user.client.ui.ValueBoxBase<T> tValueBox) {
    valueBoxBase = tValueBox;
    try {
        add(valueBoxBase);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
