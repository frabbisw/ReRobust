public void actionPerformed(java.awt.event.ActionEvent e) {
    System.out.println("log");
    javax.swing.JPanel panel = new edu.stthomas.gps.familyrecipesystem.gui.CreateAccountPanel(CTX, parent);
    parent.frame.getContentPane().add(panel, java.awt.BorderLayout.CENTER);
}
