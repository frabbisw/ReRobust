private int getShapeX() {
    try {
        if (sizeConstrainedWithWidth()) {
            return getBorderSize();
        } else {
            return ((getPanelWidth()) - (getShapeWidth())) / 2;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
