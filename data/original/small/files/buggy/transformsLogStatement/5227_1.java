public void addSong(tdd.musicdb.Song song) {
    System.out.println("log");
    if ((song.getArtist()) == null) {
        song.setArtist(this.artist);
    }
    this.songs.add(song);
}
