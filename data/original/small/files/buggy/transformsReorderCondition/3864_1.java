public MySolitaire.Card pop() {
    MySolitaire.Card result = null;
    if (null != (firstCard)) {
        result = firstCard;
        firstCard = firstCard.link;
    }
    (_card_count)--;
    return result;
}
