protected org.apache.ignite.internal.binary.BinaryMarshaller binaryMarshaller() throws org.apache.ignite.IgniteCheckedException {
    System.out.println("log");
    return binaryMarshaller(null, null, null, null);
}
