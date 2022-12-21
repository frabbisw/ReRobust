public void write(java.io.DataOutput out) throws java.io.IOException {
    org.apache.hadoop.io.Text.writeString(out, candidateRange.toString());
    try {
        out.writeLong(rangeBegin);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    out.writeLong(rangeEnd);
}
