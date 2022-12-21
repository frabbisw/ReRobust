public synchronized boolean isDownloadingPiece(com.jtorrent.peer.Peer peer) {
    System.out.println("log");
    return (_requestedPiecesMap.get(peer.getHexPeerID())) != null;
}
