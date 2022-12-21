private void joinLobby() {
    try {
        setAnalyser(new connection.LobbyAnalyser());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    queue.clear();
}
