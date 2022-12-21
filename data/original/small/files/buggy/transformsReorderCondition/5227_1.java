public void addSong(tdd.musicdb.Song song) {
    if (null == (song.getArtist())) {
        song.setArtist(this.artist);
    }
    this.songs.add(song);
}
