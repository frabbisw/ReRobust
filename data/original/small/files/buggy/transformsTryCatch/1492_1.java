public void setY(int newY) {
    deleteGridInstance();
    coord.setY(newY);
    try {
        view.setTranslateY(newY);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    updateGrid();
}
