public static int calculateDataSize(com.hazelcast.client.impl.protocol.parameters.MemberImpl member, com.hazelcast.cluster.client.MemberAttributeChange memberAttributeChange) {
    return (com.hazelcast.client.impl.protocol.parameters.MemberAttributeChangeCodec.calculateDataSize(memberAttributeChange)) + ((com.hazelcast.client.impl.protocol.ClientMessage.HEADER_SIZE) + (com.hazelcast.client.impl.protocol.parameters.MemberCodec.calculateDataSize(member)));
}
