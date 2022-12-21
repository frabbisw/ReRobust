@java.lang.Override
public void put(double value) throws java.io.IOException {
    this.writer.write(java.lang.Double.toString(value));
    try {
        this.writer.write('\n');
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
