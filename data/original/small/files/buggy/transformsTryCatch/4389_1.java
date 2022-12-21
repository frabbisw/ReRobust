public void updateSortMethod(java.lang.String sortMethod) {
    this.sortMethod = sortMethod;
    mGridMovieposterAdapter.clear();
    try {
        updateMovies(1);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
