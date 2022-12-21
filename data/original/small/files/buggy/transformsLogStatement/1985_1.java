private void startGame() {
    System.out.println("log");
    if ((game.getState()) == (es.ucm.fdi.tp.basecode.bgame.model.Game.State.Starting))
        game.start(pieces);
    else
        game.restart();
}
