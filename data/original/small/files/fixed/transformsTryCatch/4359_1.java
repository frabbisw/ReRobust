public void startPleaseNewThread() {
    myThread = new A.B(iter, constructor);
    try {
        myThread.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println(("Call start new thread with iterator " + (iter)));
}
