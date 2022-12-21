private void verwijderActionPerformed(java.awt.event.ActionEvent evt) {
    System.out.println("log");
    if ((checkFields()) == true) {
        deletePerson();
    }
}
