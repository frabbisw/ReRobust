public void setY(int newY) {
    try {
        deleteGridInstance();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    coord.setY(newY);
    updateGrid();
}
