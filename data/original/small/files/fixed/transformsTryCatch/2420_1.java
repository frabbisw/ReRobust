public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    try {
        if ((c.getWins()) == 4)
            c.changePanel("4");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    repaint();
}
