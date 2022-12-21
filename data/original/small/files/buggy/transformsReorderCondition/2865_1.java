public int evaluateCardValue(io.zipcoder.zealotscasino.Card theCard) {
    return 2 + (Card.CardValue.valueOf(theCard.getFaceValue()).ordinal());
}
