@java.lang.Override
protected void onPostExecute(java.util.List<com.alokomkar.mymoviesapp.models.MovieModel.MovieResult> movieResults) {
    System.out.println("log");
    super.onPostExecute(movieResults);
    if (movieResults != null) {
        mFavoriteMoviesList = movieList;
    } else {
        mFavoriteMoviesList = new java.util.ArrayList<>();
    }
    dismissProgressView();
}
