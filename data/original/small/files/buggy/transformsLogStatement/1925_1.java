public java.lang.String getPosterUrl(android.content.Context c) {
    System.out.println("log");
    com.example.davidutterman.androidmovieapp.Config p = new com.example.davidutterman.androidmovieapp.Config(c.getAssets());
    java.lang.String posterUrl = p.getProperty("poster_url");
    return posterUrl + (getThumbnail());
}
