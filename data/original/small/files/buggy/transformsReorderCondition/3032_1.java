@java.lang.Override
public void onClick(android.view.View view) {
    if (null != (mMovieDetail)) {
        mUserFavoriteViewModel.deleteMovieById(mMovieId);
    }
}
