@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if ((dataSnapshot.getValue()) == null) {
        finish();
    }
    mSong = dataSnapshot.getValue(com.teinvdlugt.android.piano.Song.class);
    System.out.println("log");
    if ((mSong) != null)
        loadSong();
}
