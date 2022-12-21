@java.lang.Override
public int getItemCount() {
    try {
        if (((mMoviePosters) == null) || ((mMoviePosters.size()) == 0)) {
            return 0;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return mMoviePosters.size();
}
