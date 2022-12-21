private void pause(com.softtanck.imusic.bean.Music music) {
    System.out.println("log");
    if (mplayer.isPlaying()) {
        mplayer.stop();
        com.softtanck.imusic.ConstantValue.MUSIC_CURRENT_STATE = com.softtanck.imusic.ConstantValue.MUSIC_STATE_PAUSE;
    }
}
