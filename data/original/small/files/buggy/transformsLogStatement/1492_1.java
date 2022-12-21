public void setY(int newY) {
    deleteGridInstance();
    coord.setY(newY);
    view.setTranslateY(newY);
    System.out.println("log");
    updateGrid();
}
