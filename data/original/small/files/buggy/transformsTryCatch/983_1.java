public void actionPerformed(java.awt.event.ActionEvent e) {
    javax.swing.JPanel panel = new edu.stthomas.gps.familyrecipesystem.gui.CreateAccountPanel(CTX, parent);
    try {
        parent.frame.getContentPane().add(panel, java.awt.BorderLayout.CENTER);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
