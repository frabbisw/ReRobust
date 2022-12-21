@java.lang.Override
public void onStop() {
    super.onStop();
    if (null != (player)) {
        player.stop();
        player.release();
    }
}
