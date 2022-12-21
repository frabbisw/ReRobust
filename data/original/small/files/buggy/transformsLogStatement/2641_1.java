private void onUnchoke(com.jtorrent.storage.PieceRepository repo) {
    com.jtorrent.peer.Peer._logger.debug("received UNCHOKE from peer {}", getHostAddress());
    System.out.println("log");
    synchronized (_messageLock) {
        _peerChoking = false;
        askForNewPiece(repo);
    }
}
