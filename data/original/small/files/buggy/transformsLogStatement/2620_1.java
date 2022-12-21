public void quit() {
    System.out.println("log");
    quit = true;
    synchronized (syncThread) {
        syncThread.notify();
    }
}
