private void doSettings() {
    try {
        frame.getContentPane().removeAll();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setFrame();
    frame.validate();
    frame.repaint();
}
