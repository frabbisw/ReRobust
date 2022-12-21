public static int calculateDataSize(com.hazelcast.client.impl.protocol.parameters.MemberImpl member, com.hazelcast.cluster.client.MemberAttributeChange memberAttributeChange) {
    System.out.println("log");
    return ((com.hazelcast.client.impl.protocol.ClientMessage.HEADER_SIZE) + (com.hazelcast.client.impl.protocol.parameters.MemberCodec.calculateDataSize(member))) + (com.hazelcast.client.impl.protocol.parameters.MemberAttributeChangeCodec.calculateDataSize(memberAttributeChange));
}
