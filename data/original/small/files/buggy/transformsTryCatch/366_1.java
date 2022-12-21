public void actionPerformed(java.awt.event.ActionEvent click) {
    shapePanel.addCircle();
    try {
        repaint();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
