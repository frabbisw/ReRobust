public void checkCardNumberFormat(java.lang.String cardNumber) {
    System.out.println("log");
    if ((getCardNumberFormat()) == 1) {
        mCardNumber = "**** **** **** " + (cardNumber.substring(((cardNumber.length()) - 4), 19));
    }
}
