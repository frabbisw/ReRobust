@java.lang.Override
public void onStop() {
    System.out.println("log");
    super.onStop();
    if ((player) != null) {
        player.stop();
        player.release();
    }
}
