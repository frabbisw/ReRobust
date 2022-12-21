public void seekToPosition(int i) {
    System.out.println("log");
    if (i > 10000) {
        this.player.seekToPosition(i);
    } else {
        android.util.Log.d(saiboten.no.synclistener.musicservice.SpotifyPlayerWrapper.TAG, (("Position " + i) + " is less than three seconds. Let's just skip the seek. Probably a new track"));
    }
}
