@java.lang.Override
public void onDestroy() {
    try {
        super.onDestroy();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    timer.cancel();
    com.jchingdev.squares.singleplayer.Chartboost.onDestroy(this);
}
