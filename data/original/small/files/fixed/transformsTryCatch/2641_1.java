private void onUnchoke(com.jtorrent.storage.PieceRepository repo) {
    try {
        com.jtorrent.peer.Peer._logger.debug("received UNCHOKE from peer {}", getHostAddress());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    _peerChoking = false;
    askForNewPiece(repo);
}
