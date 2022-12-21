public void joinLobby(byte bytes, java.lang.String string) {
    try {
        setAnalyser(new connection.LobbyAnalyser());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    queue.clear();
}
