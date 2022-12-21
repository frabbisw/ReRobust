@java.lang.Override
public void onClick(android.view.View v) {
    System.out.println("log");
    int index = dataset.indexOf(movie);
    db.deleteMovieFromWatchlist(movie.getId());
    removeItemFromView(index);
}
