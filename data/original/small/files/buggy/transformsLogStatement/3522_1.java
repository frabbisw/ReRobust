@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
    System.out.println("log");
    try {
        play();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}
