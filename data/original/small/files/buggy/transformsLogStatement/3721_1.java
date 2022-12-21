@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    movieAdapter.notifyDataSetChanged();
    System.out.println("log");
    if (!(movieList.isEmpty())) {
        mListener.onMovieSelected(movieList.get(0), true);
    }
}
