private void configureUrlLable() {
    address = new javax.swing.JTextField(url);
    try {
        address.setBounds(20, 5, 560, 30);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    address.setEditable(false);
    window.add(address);
}
