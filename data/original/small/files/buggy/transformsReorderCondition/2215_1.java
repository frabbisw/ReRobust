@java.lang.Override
public int read() throws java.io.IOException {
    return (end) > (seekToBeginPosition()) ? super.read() : -1;
}
