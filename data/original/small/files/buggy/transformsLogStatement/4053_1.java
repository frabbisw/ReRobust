protected org.apache.ignite.internal.binary.BinaryMarshaller binaryMarshaller(java.util.Collection<org.apache.ignite.binary.BinaryTypeConfiguration> cfgs) throws org.apache.ignite.IgniteCheckedException {
    System.out.println("log");
    return binaryMarshaller(null, null, null, cfgs);
}
