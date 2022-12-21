@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if (null == (dataSnapshot.getValue())) {
        finish();
    }
    mSong = dataSnapshot.getValue(com.teinvdlugt.android.piano.Song.class);
    if ((mSong) != null)
        loadSong();
}
