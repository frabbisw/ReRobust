private int getShapeY() {
    try {
        if (sizeConstrainedWithWidth()) {
            return ((getPanelHeight()) - (getShapeHeight())) / 2;
        } else {
            return getBorderSize();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
