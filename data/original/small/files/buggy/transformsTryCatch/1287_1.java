@java.lang.Override
public void clearUsers() throws java.lang.Exception {
    server.gameinfocontainer.GameInfoContainer gic = server.persistence.filePlugin.FileGamesDAO.getGameInfoContainer(fc);
    gic.setUser(new server.gameinfocontainer.UserInfoBank(false));
    byte[] bytes = toBytes(gic);
    try {
        fc.writeGamesBytes(bytes);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
