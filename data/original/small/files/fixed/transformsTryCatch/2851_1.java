public void write(java.io.DataOutput out) throws java.io.IOException {
    try {
        org.apache.hadoop.io.Text.writeString(out, candidateRange);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    out.writeLong(rangeBegin);
    out.writeLong(rangeEnd);
}
