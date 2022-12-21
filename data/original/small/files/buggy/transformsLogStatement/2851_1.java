public void write(java.io.DataOutput out) throws java.io.IOException {
    System.out.println("log");
    org.apache.hadoop.io.Text.writeString(out, candidateRange.toString());
    out.writeLong(rangeBegin);
    out.writeLong(rangeEnd);
}
