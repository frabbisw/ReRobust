public void setPlayer(unimelb.distributed_algo_game.player.Player mPlayer) {
    try {
        java.lang.System.out.println(("MainGamePanel" + (mPlayer.getName())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    p = mPlayer;
    gameTable.setPlayer(mPlayer);
}
