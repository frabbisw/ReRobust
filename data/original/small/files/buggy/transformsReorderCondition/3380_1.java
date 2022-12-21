@java.lang.Override
protected void onPostExecute(java.util.List<com.alokomkar.mymoviesapp.models.MovieModel.MovieResult> movieResults) {
    super.onPostExecute(movieResults);
    if (null != movieResults) {
        mFavoriteMoviesList = movieList;
    } else {
        mFavoriteMoviesList = new java.util.ArrayList<>();
    }
    dismissProgressView();
}
