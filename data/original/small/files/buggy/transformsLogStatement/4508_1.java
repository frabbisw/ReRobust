@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    boolean retry = true;
    System.out.println("log");
    while (retry) {
        try {
            thread.join();
            retry = false;
        } catch (java.lang.InterruptedException e) {
        }
    }
}
