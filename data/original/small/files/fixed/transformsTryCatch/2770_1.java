public void run() {
    try {
        com.gmail.berndivader.MythicPlayers.MythicPlayers.inst().getPlayerManager().attachActivePlayer(e.getPlayer(), true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
