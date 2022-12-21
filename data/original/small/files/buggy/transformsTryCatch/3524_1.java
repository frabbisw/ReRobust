@java.lang.Override
public void close() {
    try {
        cache.closeRead();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.closed = true;
}
