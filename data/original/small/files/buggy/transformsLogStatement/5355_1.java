public void launch(uk.dangrew.gnocchi.game.Game game) {
    System.out.println("log");
    this.game = game;
    this.game.properties().reset();
    this.stack.stack(new uk.dangrew.gnocchi.framework.GameAction(new uk.dangrew.gnocchi.framework.action.FillAction(game), new uk.dangrew.gnocchi.framework.animation.GravityAnimation(game)));
}
