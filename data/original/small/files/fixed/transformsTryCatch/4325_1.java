public boolean isDownloadingPiece(com.jtorrent.peer.Peer peer) {
    try {
        synchronized (peer) {
            return (_requestedPiecesMap.get(peer.getHexPeerID())) != null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
