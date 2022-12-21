public int evaluateCardValue(io.zipcoder.zealotscasino.Card theCard) {
    System.out.println("log");
    return (Card.CardValue.valueOf(theCard.getFaceValue()).ordinal()) + 2;
}
