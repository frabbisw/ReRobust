@java.lang.Override
public void paintFigure(org.eclipse.draw2d.Graphics graphics) {
    try {
        drawBlurredShadow(graphics);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.paintFigure(graphics);
}
