public void setBoardBeginState(nl.hanze2017e4.gameclient.model.master.Player playsFirst, nl.hanze2017e4.gameclient.model.master.Player otherPlayer) {
    setPlayerAtPos(playsFirst, 28);
    setPlayerAtPos(otherPlayer, 27);
    setPlayerAtPos(playsFirst, 35);
    try {
        setPlayerAtPos(otherPlayer, 36);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
