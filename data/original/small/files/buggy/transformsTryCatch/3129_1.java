private void button2ActionPerformed(java.awt.event.ActionEvent e) {
    try {
        new PutOutStorage("出库").setVisible(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
