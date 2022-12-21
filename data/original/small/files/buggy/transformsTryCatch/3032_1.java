@java.lang.Override
public void onClick(android.view.View view) {
    try {
        if ((mMovieDetail) != null) {
            mUserFavoriteViewModel.deleteMovieById(mMovieId);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
