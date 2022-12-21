public void setBoardBeginState(nl.hanze2017e4.gameclient.model.master.Player playsFirst, nl.hanze2017e4.gameclient.model.master.Player otherPlayer) {
    super.setPlayerAtPos(playsFirst, 28);
    super.setPlayerAtPos(otherPlayer, 27);
    try {
        super.setPlayerAtPos(playsFirst, 35);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.setPlayerAtPos(otherPlayer, 36);
}
