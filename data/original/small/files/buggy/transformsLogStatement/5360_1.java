private void addProductButtonActionPerformed(java.awt.event.ActionEvent evt) {
    System.out.println("log");
    gpCon.addToCart(prod, this.getSpinnerValue(), imf);
}
