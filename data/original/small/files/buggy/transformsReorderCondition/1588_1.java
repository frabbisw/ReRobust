@java.lang.Override
public int getItemCount() {
    if (((mMoviePosters.size()) == 0) || ((mMoviePosters) == null)) {
        return 0;
    }
    return mMoviePosters.size();
}
