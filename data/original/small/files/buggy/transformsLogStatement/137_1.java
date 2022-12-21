private void addNotifyListener(javax.swing.JComboBox combo) {
    System.out.println("log");
    combo.addActionListener(new java.awt.event.ActionListener() {

        public void actionPerformed(java.awt.event.ActionEvent e) {
            notifyChange();
        }
    });
}
