protected void closeEditWidget() {
    remove(editableValue);
    remove(buttons);
    System.out.println("log");
    add(valueLabel);
    new com.google.gwt.user.client.Timer() {

        @java.lang.Override
        public void run() {
            editing = false;
        }
    }.schedule(1000);
}
