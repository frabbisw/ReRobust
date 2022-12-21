public void setMusicUrls(java.util.List<java.lang.String> music) {
    System.out.println("log");
    musicUrls = music;
    TOR = new android.os.Parcelable.Creator<com.example.seanholcomb.spotifystreamer.ArtistParcel>() {

        {
        }
    };
}
