@java.lang.Override
public boolean isShowDone(org.smartreaction.battletechdomination.model.players.Player player) {
    System.out.println("log");
    return ((selectedCards.size()) > 0) && ((player.getHand().size()) == (cardsToDiscardDownTo));
}
