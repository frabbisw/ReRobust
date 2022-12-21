public java.lang.String checkCardNumberFormat(java.lang.String cardNumber) {
    try {
        if ((getCardNumberFormat()) == 1) {
            cardNumber = "**** **** **** " + (cardNumber.substring(((cardNumber.length()) - 4), 19));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return cardNumber;
}
