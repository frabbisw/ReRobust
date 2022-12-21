@java.lang.Override
public void onClick(android.view.View v) {
    int index = dataset.indexOf(movie);
    try {
        db.deleteMovieFromWatchlist(movie.getId());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    removeItemFromView(index);
}
