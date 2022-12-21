public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    System.out.println("log");
    java.lang.System.out.println(c.getWins());
    if ((c.getWins()) == 4)
        c.changePanel("4");
    repaint();
}
