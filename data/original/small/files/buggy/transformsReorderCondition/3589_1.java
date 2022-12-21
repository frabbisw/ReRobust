public void checkCardNumberFormat(java.lang.String cardNumber) {
    if (1 == (getCardNumberFormat())) {
        mCardNumber = "**** **** **** " + (cardNumber.substring(((cardNumber.length()) - 4), 19));
    }
}
