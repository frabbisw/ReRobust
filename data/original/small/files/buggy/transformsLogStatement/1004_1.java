private java.awt.Shape getScreenTranslatedShape() {
    System.out.println("log");
    java.awt.geom.AffineTransform at = java.awt.geom.AffineTransform.getTranslateInstance(xLoc, yLoc);
    return at.createTransformedShape(getLocallyTransformedShape());
}
