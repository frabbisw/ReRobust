@java.lang.Override
public void onClick(android.view.View view) {
    System.out.println("log");
    if ((mMovieDetail) != null) {
        mUserFavoriteViewModel.deleteMovieById(mMovieId);
    }
}
