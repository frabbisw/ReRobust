@java.lang.Override
protected org.eclipse.draw2d.IFigure createFigure() {
    final org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel label = new org.yakindu.base.xtext.utils.gmf.figures.SyntaxColoringLabel();
    try {
        label.setTextWrap(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    label.setAlignment(((org.eclipse.draw2d.PositionConstants.LEFT) | (org.eclipse.draw2d.PositionConstants.TOP)));
    return label;
}
