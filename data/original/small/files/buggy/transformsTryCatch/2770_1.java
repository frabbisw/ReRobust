public void run() {
    try {
        com.gmail.berndivader.MythicPlayers.MythicPlayers.inst().getPlayerManager().attachActivePlayer(e.getPlayer());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
