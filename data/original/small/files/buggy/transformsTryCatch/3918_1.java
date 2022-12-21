private int getShapeY() {
    try {
        if (sizeConstrainedWithWidth()) {
            return (((getPanelHeight()) - (getShapeHeight())) / 2) - (getBorderSize());
        } else {
            return 0;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
