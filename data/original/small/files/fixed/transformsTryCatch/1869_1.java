@java.lang.Override
public void saveMoviesToRealm(java.util.List<com.example.filip.movielist.pojo.MovieListModel> listOfMovies) {
    mRealmInstance.beginTransaction();
    try {
        mRealmInstance.copyToRealmOrUpdate(listOfMovies);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mRealmInstance.commitTransaction();
}
