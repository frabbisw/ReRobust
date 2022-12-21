public void addSong(tdd.musicdb.Song song) {
    try {
        if ((song.getArtist()) == null) {
            song.setArtist(this.artist);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.songs.add(song);
}
