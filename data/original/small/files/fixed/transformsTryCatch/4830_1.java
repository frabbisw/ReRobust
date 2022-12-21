@java.lang.Override
public void onStop() {
    super.onStop();
    try {
        if ((player) != null) {
            player.stop();
            player.release();
            player = null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
