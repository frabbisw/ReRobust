@java.lang.Override
public boolean apply(mage.game.Game game, mage.abilities.Ability source) {
    System.out.println("log");
    return !(game.getOpponents(source.getControllerId()).contains(game.getActivePlayerId()));
}
