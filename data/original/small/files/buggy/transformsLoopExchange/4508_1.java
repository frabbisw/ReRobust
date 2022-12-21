@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    boolean retry = true;
    for (; retry; ) {
        try {
            thread.join();
            retry = false;
        } catch (java.lang.InterruptedException e) {
        }
    }
}
