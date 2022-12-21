@java.lang.Override
public void put(double value) throws java.io.IOException {
    try {
        writer.append(java.lang.Double.toString(value));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    writer.append('\n');
}
