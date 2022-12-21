private void button2ActionPerformed(java.awt.event.ActionEvent e) {
    try {
        new PutOutStorage().setVisible(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
