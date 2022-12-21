@java.lang.Override
public void onResume() {
    super.onResume();
    if (null != (com.myandroid.popularmovies.fragments.MainActivityFragment.state)) {
        android.util.Log.v(LOG_TAG, "state != null");
        gridView.onRestoreInstanceState(com.myandroid.popularmovies.fragments.MainActivityFragment.state);
    }
}
