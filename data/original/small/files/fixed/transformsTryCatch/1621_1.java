@java.lang.Override
public void onGameModeJoin(net.frozenbit.plugin5zig.cubecraft.gamemodes.DuelsGameMode gameMode) {
    try {
        super.onGameModeJoin(gameMode);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    timer = 0;
}
