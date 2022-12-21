private void addFirstColumn(java.lang.String value) throws java.io.IOException {
    System.out.println("log");
    csvStream.write(",".getBytes(UTF8));
    addColumn(value);
}
