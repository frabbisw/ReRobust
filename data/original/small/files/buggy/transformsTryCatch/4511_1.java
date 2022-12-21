@java.lang.Override
public nl.tudelft.ti2806.riverrush.game.state.GameState finish(final java.lang.Integer team) {
    try {
        this.screen.dispose();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new nl.tudelft.ti2806.riverrush.game.state.FinishedGameState(this.dispatcher, this.game, team);
}
