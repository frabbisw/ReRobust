public void loginActionListener(javax.faces.event.ActionEvent event) {
    try {
        java.lang.System.err.println(("something something event from " + (event.getComponent().getClientId())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
