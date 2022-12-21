@java.lang.Override
public void close() {
    cache.closeRead();
    System.out.println("log");
    this.closed = true;
}
