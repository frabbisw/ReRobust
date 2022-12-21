private void buildFrame() {
    frame = new javax.swing.JFrame("Asteroid Dodger");
    try {
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    frame.setLocationRelativeTo(null);
    frame.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
    frame.setSize(new java.awt.Dimension(1000, 1000));
}
