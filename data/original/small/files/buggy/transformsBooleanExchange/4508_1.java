@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    boolean retry = false;
    while (!(retry)) {
        try {
            thread.join();
            retry = true;
        } catch (java.lang.InterruptedException e) {
        }
    }
}
