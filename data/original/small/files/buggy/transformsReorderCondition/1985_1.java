private void startGame() {
    if ((es.ucm.fdi.tp.basecode.bgame.model.Game.State.Starting) == (game.getState()))
        game.start(pieces);
    else
        game.restart();
}
