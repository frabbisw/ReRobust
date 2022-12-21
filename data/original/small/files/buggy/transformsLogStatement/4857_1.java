@java.lang.Override
public void paintFigure(org.eclipse.draw2d.Graphics graphics) {
    drawBlurredShadow(graphics);
    System.out.println("log");
    super.paintFigure(graphics);
}
