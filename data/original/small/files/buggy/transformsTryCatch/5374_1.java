@java.lang.Override
public void startEngine() {
    try {
        pl.engine.Utils.debug("========================================");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    pl.engine.Utils.debug("======= \tSHAKE GAME START !!! ========");
    pl.engine.Utils.debug("========================================");
    for (pl.engine.Team team : teams) {
        team.printPlayers();
    }
    gc.sendGameEvent("shake-start");
}
