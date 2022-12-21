public void loginActionListener(javax.faces.event.ActionEvent event) {
    System.out.println("log");
    java.lang.System.err.println(("something something event from " + (event.getComponent().getClientId())));
}
