@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
    try {
        bg = new com.droidkings.game.Background(android.graphics.BitmapFactory.decodeResource(getResources(), R.drawable.gamebg1));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    thread.setRunning(true);
    thread.start();
}
