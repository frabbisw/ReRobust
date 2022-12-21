private void addProductButtonActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        gpCon.addToCart(prod, this.getSpinnerValue(), imf);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
