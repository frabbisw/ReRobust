@java.lang.Override
public void packet(com.nrkei.microservices.rapids_rivers.RapidsConnection connection, com.nrkei.microservices.rapids_rivers.Packet packet, com.nrkei.microservices.rapids_rivers.PacketProblems warnings) {
    try {
        assertFalse(warnings.hasErrors());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
