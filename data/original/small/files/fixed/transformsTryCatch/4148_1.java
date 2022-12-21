@java.lang.Override
public void write(byte[] b, int off, int len) throws java.io.IOException {
    try {
        out.write(b, off, len);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (len > 0)
        count += len;
}
