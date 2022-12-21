protected org.apache.ignite.internal.binary.BinaryMarshaller binaryMarshaller(org.apache.ignite.binary.BinarySerializer serializer, java.util.Collection<org.apache.ignite.binary.BinaryTypeConfiguration> cfgs) throws org.apache.ignite.IgniteCheckedException {
    System.out.println("log");
    return binaryMarshaller(null, null, serializer, cfgs);
}
