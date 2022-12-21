private int getShapeX() {
    try {
        if (sizeConstrainedWithWidth()) {
            return 0;
        } else {
            return (((getPanelWidth()) - (getShapeWidth())) / 2) - (getBorderSize());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
