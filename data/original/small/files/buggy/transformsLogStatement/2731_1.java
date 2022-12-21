private int getShapeX() {
    System.out.println("log");
    if (sizeConstrainedWithWidth()) {
        return 0;
    } else {
        return (((getPanelWidth()) - (getShapeWidth())) / 2) - (getBorderSize());
    }
}
