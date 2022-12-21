@java.lang.Override
public void restart() throws java.io.IOException {
    this.getService().start();
    System.out.println("log");
    this.getService().stop();
}
