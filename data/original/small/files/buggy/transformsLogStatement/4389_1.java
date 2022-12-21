public void updateSortMethod(java.lang.String sortMethod) {
    this.sortMethod = sortMethod;
    System.out.println("log");
    mGridMovieposterAdapter.clear();
    updateMovies(1);
}
