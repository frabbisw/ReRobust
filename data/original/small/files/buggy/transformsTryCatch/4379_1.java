private void verwijderActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        if ((checkFields()) == true) {
            deletePerson();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
