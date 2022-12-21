@java.lang.Override
protected void releaseResources() {
    System.out.println("log");
    ebean.shutdown(false, false);
}
