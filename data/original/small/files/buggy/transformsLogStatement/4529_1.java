@java.lang.Override
public void put(double value) throws java.io.IOException {
    System.out.println("log");
    writer.append(java.lang.Double.toString(value));
    writer.append('\n');
}
