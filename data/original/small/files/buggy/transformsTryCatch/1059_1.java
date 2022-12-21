@java.lang.Override
public void onSearchResultDownloaded(java.util.ArrayList<com.example.user.cloudplayer.model.PlayList> playLists) {
    try {
        if (playLists == null) {
            android.widget.Toast.makeText(this, getResources().getString(R.string.search_alert), Toast.LENGTH_LONG).show();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
