public static java.lang.String getCurrentTitle ( android.content.Context context , boolean preparing ) { return context == null ? "" : ( br.com.carlosrafaelgn.fplay.playback.Player.localSong ) == null ? context . getText ( R.string.nothing_playing ) . toString () : ! preparing ? br.com.carlosrafaelgn.fplay.playback.Player.localSong.title : ( ( context . getText ( R.string.loading ) ) + " " ) + ( br.com.carlosrafaelgn.fplay.playback.Player.localSong.title ) ; } 