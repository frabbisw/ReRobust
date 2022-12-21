@java.lang.Override
public void onSearchResultDownloaded(java.util.ArrayList<com.example.user.cloudplayer.model.PlayList> playLists) {
    if (null == playLists) {
        android.widget.Toast.makeText(this, getResources().getString(R.string.search_alert), Toast.LENGTH_LONG).show();
    }
}
