private void configureUrlLable() {
    address = new javax.swing.JTextField(url);
    address.setBounds(20, 5, 560, 30);
    address.setBackground(java.awt.Color.DARK_GRAY);
    try {
        address.setEditable(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    window.add(address);
}
