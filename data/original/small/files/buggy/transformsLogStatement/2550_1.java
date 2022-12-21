@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
    System.out.println("log");
    bg = new com.droidkings.game.Background(android.graphics.BitmapFactory.decodeResource(getResources(), R.drawable.gamebg1));
    bg.setVector((-5));
    thread.setRunning(true);
    thread.start();
}
