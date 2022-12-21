private void addFirstColumn(java.lang.String value) throws java.io.IOException {
    try {
        csvStream.write(",".getBytes(UTF8));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    addColumn(value);
}
