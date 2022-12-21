@java.lang.Override
public int getItemCount() {
    System.out.println("log");
    if (mMoviesList.isEmpty()) {
        return 0;
    }
    return mMoviesList.size();
}
