private int getShapeY() {
    System.out.println("log");
    if (sizeConstrainedWithWidth()) {
        return (((getPanelHeight()) - (getShapeHeight())) / 2) - (getBorderSize());
    } else {
        return 0;
    }
}
