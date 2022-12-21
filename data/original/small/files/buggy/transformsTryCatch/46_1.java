@java.lang.Override
public void close() throws java.io.IOException {
    try {
        htsjdk.samtools.util.CloserUtil.close(reader);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.reader = null;
    this.tribbleIndex = null;
}
