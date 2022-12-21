private void pause(com.softtanck.imusic.bean.Music music) {
    try {
        if (mplayer.isPlaying()) {
            mplayer.pause();
            com.softtanck.imusic.ConstantValue.MUSIC_CURRENT_STATE = com.softtanck.imusic.ConstantValue.MUSIC_STATE_PAUSE;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
