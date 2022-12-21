@java.lang.Override
protected void onPostExecute(java.util.List<com.cats.lisamariewatkins.popularmovies.Models.Movie> movies) {
    try {
        if (!(movies.isEmpty())) {
            showSuccessView();
            mMoviesAdapter.setMovies(movies);
        } else {
            showErrorView();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
