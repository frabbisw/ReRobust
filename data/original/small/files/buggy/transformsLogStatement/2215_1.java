@java.lang.Override
public int read() throws java.io.IOException {
    System.out.println("log");
    return (seekToBeginPosition()) < (end) ? super.read() : -1;
}
