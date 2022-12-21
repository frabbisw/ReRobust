public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    java.lang.System.out.println(c.getWins());
    if (4 == (c.getWins()))
        c.changePanel("4");
    repaint();
}
