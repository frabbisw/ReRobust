@java.lang.Override
public void write(byte[] buffer) throws java.io.IOException {
    try {
        this.write(buffer, 0, buffer.length);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
