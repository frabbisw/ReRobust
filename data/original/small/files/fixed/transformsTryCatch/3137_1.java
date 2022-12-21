private void parsePacket(client.Packet packet) throws java.io.IOException {
    client.Message message = packet.getPayload();
    try {
        if (message instanceof client.TextMessage) {
            java.lang.System.out.println(((client.TextMessage) (message)).getMessage());
            acknowledgePacket(packet);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
