@java.lang.Override
public void onClick(android.view.View view) {
    try {
        mUserFavoriteViewModel.deleteMovieById(mMovieId);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
