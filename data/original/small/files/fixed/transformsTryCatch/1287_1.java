@java.lang.Override
public void clearUsers() throws java.lang.Exception {
    server.gameinfocontainer.GameInfoContainer gic = new server.gameinfocontainer.GameInfoContainer(false);
    byte[] bytes = toBytes(gic);
    try {
        fc.writeGamesBytes(bytes);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
