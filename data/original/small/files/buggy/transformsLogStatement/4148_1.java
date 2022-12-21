@java.lang.Override
public void write(byte[] b, int off, int len) throws java.io.IOException {
    System.out.println("log");
    out.write(b, off, len);
    count += len;
}
