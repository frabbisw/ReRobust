public void startPleaseNewThread() {
    myThread = new A.B(iter, constructor);
    myThread.start();
    isRunning = true;
    try {
        java.lang.System.out.println(("Call start new thread with iterator " + (iter)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
