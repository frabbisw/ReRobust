private void addNotifyListener(javax.swing.JComboBox combo) {
    try {
        combo.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent e) {
                notifyChange();
            }
        });
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
