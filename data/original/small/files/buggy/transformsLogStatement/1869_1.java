@java.lang.Override
public void saveMoviesToRealm(java.util.List<com.example.filip.movielist.pojo.MovieListModel> listOfMovies, java.lang.String movieType) {
    System.out.println("log");
    mRealmInstance.beginTransaction();
    mRealmInstance.copyToRealmOrUpdate(listOfMovies);
    mRealmInstance.commitTransaction();
}
