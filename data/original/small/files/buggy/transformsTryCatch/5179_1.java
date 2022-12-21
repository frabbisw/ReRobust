public void generateValue(java.lang.String entryName, long value) throws java.io.IOException {
    writer.append(entryName);
    writer.append(" ");
    try {
        writer.append(java.lang.Double.toString(((double) (value))));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
