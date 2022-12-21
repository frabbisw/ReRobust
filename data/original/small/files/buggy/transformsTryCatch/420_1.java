@java.lang.Override
public int getItemCount() {
    try {
        if (mMoviesList.isEmpty()) {
            return 0;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return mMoviesList.size();
}
