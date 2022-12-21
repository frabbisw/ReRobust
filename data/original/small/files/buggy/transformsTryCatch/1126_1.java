public void setPlayer(unimelb.distributed_algo_game.player.Player mPlayer) {
    java.lang.System.out.println(("MainGamePanel" + (mPlayer.getName())));
    try {
        gameTable.setPlayer(mPlayer);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
