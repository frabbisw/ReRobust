@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if ((dataSnapshot.getValue()) == null) {
        finish();
    }
    mSong = dataSnapshot.getValue(com.teinvdlugt.android.piano.Song.class);
    try {
        if ((mSong) != null)
            loadSong();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
