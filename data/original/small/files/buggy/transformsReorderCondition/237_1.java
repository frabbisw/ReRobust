@java.lang.Override
public boolean isShowDone(org.smartreaction.battletechdomination.model.players.Player player) {
    return ((player.getHand().size()) == (cardsToDiscardDownTo)) && ((selectedCards.size()) > 0);
}
