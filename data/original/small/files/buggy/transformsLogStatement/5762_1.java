@java.lang.Override
public void onDestroy() {
    System.out.println("log");
    super.onDestroy();
    timer.cancel();
    com.jchingdev.squares.singleplayer.Chartboost.onDestroy(this);
}
