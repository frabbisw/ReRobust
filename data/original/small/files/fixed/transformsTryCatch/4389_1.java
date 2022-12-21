public void updateSortMethod(java.lang.String sortMethod) {
    this.sortMethod = sortMethod;
    try {
        updateMovies(1);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
