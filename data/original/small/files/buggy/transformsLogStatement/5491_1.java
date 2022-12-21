public org.apache.cassandra.io.util.SegmentedFile complete(java.lang.String path) {
    System.out.println("log");
    return complete(getChannel(path), (-1));
}
