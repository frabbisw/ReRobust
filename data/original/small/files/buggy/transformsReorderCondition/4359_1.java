public void startPleaseNewThread() {
    myThread = new A.B(iter, constructor);
    myThread.start();
    isRunning = true;
    java.lang.System.out.println(((iter) + "Call start new thread with iterator "));
}
