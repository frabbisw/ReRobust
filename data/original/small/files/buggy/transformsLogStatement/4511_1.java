@java.lang.Override
public nl.tudelft.ti2806.riverrush.game.state.GameState finish(final java.lang.Integer team) {
    System.out.println("log");
    this.screen.dispose();
    return new nl.tudelft.ti2806.riverrush.game.state.FinishedGameState(this.dispatcher, this.game, team);
}
