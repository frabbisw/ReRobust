public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    java.lang.System.out.println(c.getWins());
    if ((c.getWins()) == 4)
        c.changePanel("4");
    try {
        repaint();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
