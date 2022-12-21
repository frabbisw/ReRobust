private void doSettings() {
    frame.getContentPane().removeAll();
    setFrame(new java.awt.Dimension(700, 700));
    try {
        frame.validate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    frame.repaint();
}
