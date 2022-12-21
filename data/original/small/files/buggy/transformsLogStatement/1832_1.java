@java.lang.Override
public void close() throws java.lang.Exception {
    timer.cancel();
    executor.shutdown();
    searchEngine.quit();
    System.out.println("log");
    controllerEngine.quit();
}
