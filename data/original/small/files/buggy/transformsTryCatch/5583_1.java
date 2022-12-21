@java.lang.Override
public void onFailure(retrofit2.Call<com.example.android.popularmoviesstagetwo.model.MoviesListResponse> call, java.lang.Throwable t) {
    try {
        android.widget.Toast.makeText(getContext(), getString(R.string.internet_connection_message), Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
