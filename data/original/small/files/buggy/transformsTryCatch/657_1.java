public void paintComponent(java.awt.Graphics graph) {
    try {
        java.lang.System.out.println("Painting JPanel");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.awt.Graphics2D graph2D = ((java.awt.Graphics2D) (graph));
    this.view.draw(graph);
}
