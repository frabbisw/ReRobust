@java.lang.Override
public void write(byte[] buffer) throws java.io.IOException {
    System.out.println("log");
    this.write(buffer, 0, buffer.length);
}
