public synchronized boolean isDownloadingPiece(com.jtorrent.peer.Peer peer) {
    return null != (_requestedPiecesMap.get(peer.getHexPeerID()));
}
