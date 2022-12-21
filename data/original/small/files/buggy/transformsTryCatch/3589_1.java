public void checkCardNumberFormat(java.lang.String cardNumber) {
    try {
        if ((getCardNumberFormat()) == 1) {
            mCardNumber = "**** **** **** " + (cardNumber.substring(((cardNumber.length()) - 4), 19));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
