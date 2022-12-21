protected void closeEditWidget() {
    try {
        remove(editableValue);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    remove(buttons);
    add(valueLabel);
    new com.google.gwt.user.client.Timer() {

        @java.lang.Override
        public void run() {
            editing = false;
        }
    }.schedule(1000);
}
