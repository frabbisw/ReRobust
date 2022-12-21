public void resetBet() {
    aceMode = false;
    diceNumber = 1;
    diceValue = 2;
    displayDiceNumber(diceNumber);
    try {
        displayDiceValue(diceValue);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
