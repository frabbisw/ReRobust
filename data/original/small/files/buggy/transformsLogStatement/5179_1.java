public void generateValue(java.lang.String entryName, long value) throws java.io.IOException {
    writer.append(entryName);
    System.out.println("log");
    writer.append(" ");
    writer.append(java.lang.Double.toString(((double) (value))));
}
