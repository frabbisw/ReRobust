@java.lang.Override
public io.subutai.common.peer.Peer call() throws java.lang.Exception {
    try {
        peerPekPubKeys.put(peer, peer.createPeerEnvironmentKeyPair(environment.getEnvironmentId()).getKey());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return peer;
}
