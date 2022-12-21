@java.lang.Override
public void onStop() {
    try {
        super.onStop();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((player) != null) {
        player.stop();
        player.release();
    }
}
