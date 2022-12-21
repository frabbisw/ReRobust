@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    try {
        mSong = dataSnapshot.getValue(com.teinvdlugt.android.piano.Song.class);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((mSong) == null) {
        finish();
    } else {
        loadSong();
    }
}
