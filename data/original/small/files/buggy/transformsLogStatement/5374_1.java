@java.lang.Override
public void startEngine() {
    pl.engine.Utils.debug("========================================");
    pl.engine.Utils.debug("======= \tSHAKE GAME START !!! ========");
    pl.engine.Utils.debug("========================================");
    System.out.println("log");
    for (pl.engine.Team team : teams) {
        team.printPlayers();
    }
    gc.sendGameEvent("shake-start");
}
